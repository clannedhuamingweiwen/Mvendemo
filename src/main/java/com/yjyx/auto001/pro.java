package com.yjyx.auto001;

import java.io.FileInputStream;
import java.util.Properties;

public class pro {

    public String filePATH;
    public String key;



//

    public pro(){

    }

    //要加上void关键字
    public void getConfig(String filePATH,String key) {

        this.filePATH =filePATH;
        this.key=key;

        try {
            Properties locator = new Properties();
            //加载配置文件所在的路径
            locator.load(new FileInputStream(filePATH));
            System.out.println(locator.getProperty(key));


        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]){

        pro t =new pro();
        t.filePATH ="C:\\Users\\win10\\Desktop\\work\\test.properties";
        t.key ="username";
   //     System.out.println(t.filePATH);

        t.getConfig(t.filePATH,t.key);
    }


}
