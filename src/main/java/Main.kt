import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val listaImionDlaCoreczki = mutableListOf<String>()
    val reader = Files.newBufferedReader(Paths.get("D:\\roboczy\\Coreczka\\listaImionek.csv"))
    val csvParser = CSVParser(reader, CSVFormat.DEFAULT)



    for (csvRecord in csvParser){
            val name = csvRecord.get(0)
            //     println("$name")
            listaImionDlaCoreczki.add(name)

    }

    println(listaImionDlaCoreczki)

}
