
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.print.attribute.Attribute;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;

public class  tem {



    public static void main(String args[]) throws IOException,TemplateException{
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
        cfg.setDirectoryForTemplateLoading(new File("C:\\Users\\win10\\Desktop\\gc\\template\\"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.DEBUG_HANDLER.RETHROW_HANDLER);

        //
        Map<String,Object> root =new HashMap<String ,Object>();

        root.put("packageName", "com.ricky.java");
        root.put("className", "Student");
//        root.put("class1Name","Teacher");
//        root.put("class2Name","Parent");
        root.put("author", "Ricky Fung");




//        List<Attribute> attr_list =new ArrayList<Attribute>();
//        attr_list.add(new Attribute("id", "Long"));


        //
        Template temp = cfg.getTemplate("5.ftl");


        //
//        Writer out = new OutputStreamWriter(System.out);
//        System.out.println(out);
        File dir = new File("C:\\Users\\win10\\Desktop\\gc\\src");
        if(!dir.exists()){
            dir.mkdirs();
        }
        OutputStream fos = new  FileOutputStream( new File(dir, "Person002.java")); //java文件的生成目录
        Writer out = new OutputStreamWriter(fos);
        temp.process(root, out);

        fos.flush();
        fos.close();












    }

}


