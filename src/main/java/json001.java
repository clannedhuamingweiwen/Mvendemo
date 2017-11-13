import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.HashMap;


public class json001 implements java.io.Serializable{

   //进行序列化操作
    public static void main(String [] args){

        json001 js =new json001();
        js.name ="python";

        js.SSN =1122333;
        js.number =101;

        try{

            FileOutputStream fileout =new FileOutputStream("C:\\Users\\win10\\Desktop\\work\\1.ser");
            ObjectOutputStream out =new ObjectOutputStream(fileout);
            out.writeObject(js);
            out.close();
            fileout.close();

            System.out.printf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        }catch (IOException e){
            e.printStackTrace();
        }

        //进行反序列化操作








    }

    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck(){
        System.out.println("Mailing a check to " + name
                + " " + address);

    }


}




