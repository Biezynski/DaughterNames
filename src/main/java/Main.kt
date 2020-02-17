import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.nio.file.Files
import java.nio.file.Paths

fun takeFirst2000Names( listOfNames : List<String>) : List<String>{
    return listOfNames.drop(1).take(269).shuffled()
}
fun main() {
    val listaImionDlaCoreczki = mutableListOf<String>()
    val reader = Files.newBufferedReader(Paths.get("D:\\roboczy\\Coreczka\\listaImionek.csv"))
    val csvParser = CSVParser(reader, CSVFormat.DEFAULT)


    for (csvRecord in csvParser){
            val name = csvRecord.get(0)
            listaImionDlaCoreczki.add(name)
    }


    val shuffledListNamesForDaughter = takeFirst2000Names(listaImionDlaCoreczki)

    val exportFileToExcelObject = ExportToExcel().writeToExcelFile(shuffledListNamesForDaughter)


}
