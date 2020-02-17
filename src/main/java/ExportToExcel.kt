
import java.io.File
import java.io.FileOutputStream
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFWorkbook




class ExportToExcel {


    private fun createList(name :String, row: Row) // creating cells for each row
    {
        var cell = row.createCell(0)
        cell.setCellValue(name)
    }

    fun writeToExcelFile(doutherNameList: List<String>) {


        try {
            val workbook = XSSFWorkbook()

            val sheet = workbook.createSheet("Imiona")// creating a blank sheet
            var rownum = 0
            for (user in doutherNameList) {
                val row = sheet.createRow(rownum++)
                createList(user, row)

            }

            val out = FileOutputStream(File("Imiona.xlsx")) // file name with path
            workbook.write(out)
            out.close()

        } catch (e: Exception) {
            e.printStackTrace()
        }


    }



}