import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Properties;

public class Untiltys {

    public String info;

    //读取配置文件信息
    public String getConfig() {

        try {
            Properties pps = new Properties();
            pps.load(new FileInputStream("C:\\Users\\win10\\Desktop\\work\\test.properties"));
            //获取配置文件的信息
            Enumeration enum1 = pps.propertyNames();
            //使用枚举方法进行元素的遍历

            while (enum1.hasMoreElements()) {
                String k = (String) enum1.nextElement();
                String v = pps.getProperty(k);
//             System.out.println("配置文件是："+enum1);
                //使用+操作符来进行标准打印输出
                return k;

            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        return "error";

    }



  }







