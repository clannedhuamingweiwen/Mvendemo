import org.apache.poi.hssf.eventmodel.ERFListener;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;



public class EXcelutil1 {

     //?
       private static XSSFSheet Excelsheet;
       private static XSSFWorkbook workbook;
       private static XSSFCell cell;



    public static void setFilePath(String Path,String sheetName)throws Exception {

        try {
            FileInputStream excelFile = new FileInputStream(Path);
            workbook = new XSSFWorkbook(excelFile);
            Excelsheet = workbook.getSheet(sheetName);
          //  System.out.println(Excelsheet.getSheetName());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    //读取Excel单元格中的测试数据
    public static String getCellData(int RowNum,int ColNum)throws Exception{
        try{
            cell =Excelsheet.getRow(RowNum).getCell(ColNum);
            System.out.println(cell);
            String celldata =cell.getCellType() ==XSSFCell.CELL_TYPE_STRING? cell.getStringCellValue() +"":String.valueOf(Math.round(cell.getNumericCellValue()));
            return celldata;


        }catch (Exception e1){
            e1.printStackTrace();
        }

        return null;



    }



    public static void main(String args[])throws Exception{

        String p ="C:\\Users\\win10\\Desktop\\work\\data.xlsx";
        String name ="sheet1";
        EXcelutil1.setFilePath(p,name);
        if (EXcelutil1.getCellData(1,0).equals("java")){
            System.out.println("aaa");
        }else{
            System.out.println("bbbb");
        }


        //需要加上输出语句
   //     System.out.println(EXcelutil1.getCellData(0,0));



    }
}