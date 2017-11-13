
import java.lang.String;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


//import java.util.List;
//import java.util.Map;


/**
 *
 * 使用Java原生的来发送Http请求
 */

public class postman_nature {


    /**
     * 发送get方式的请求
     * @param url
     * @return
     */

    public static String sendGet(String url){
           String result = "";
           BufferedReader in = null;

           try{

               String urlNameString =url;
               URL realUrl = new URL(urlNameString);

               URLConnection connection = realUrl.openConnection();
               //设置通用属性
               connection.setRequestProperty("accept", "*/*");
               connection.setRequestProperty("connection", "Keep-Alive");
               connection.setRequestProperty("user-agent",
                       "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

               //建立实际的连接
               connection.connect();

               //获取所有响应头字段


               Map<String,List<String>> map  =connection.getHeaderFields();

               //遍历所有的响应头
               for(String key:map.keySet()){
                   System.out.println(key + "--->" + map.get(key));
               }

               // 定义 BufferedReader输入流来读取URL的响应

               in =new BufferedReader(new InputStreamReader(connection.getInputStream()));
               String line;

               //while (line =in.readLine())!=null){  while后面少了一个左括号

               while((line =in.readLine())!=null) {
                   result += line;


               }
               }catch (Exception e){
               System.out.println("发送GET请求出现异常！" + e);
               e.printStackTrace();
               //使用finally块关闭输入流   无论怎么样都会执行
           }finally {
               try{
                   if (in !=null){
                       in.close();
                   }
               }catch (Exception e1 ){
                   e1.printStackTrace();
               }
               return result;
           }











       }



       public static String sendPost(String url,Map<String,String> param) {
           PrintWriter out = null;
           String result = "";
           BufferedReader in = null;

           try {
               //创建url的实例化对象
               URL realUrl = new URL(url);
               //创建新的连接对象
               URLConnection connection1 = realUrl.openConnection();
               //设置通用属性（缺省默认的配置信息）
//               connection1.setRequestProperty("accept", "*/*");
//               connection1.setRequestProperty("connection", "Keep-Alive");
//               connection1.setRequestProperty("user-agent",
//                       "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

               //配置信息2
               connection1.setDoOutput(true);
               connection1.setDoInput(true);
               // 获取URLConnection对象对应的输出流
               out = new PrintWriter(connection1.getOutputStream());
               //发送请求参数

               out.print(param);



               //flush输出流的缓冲
               out.flush();
               // 定义BufferedReader输入流来读取URL的响应
               in = new BufferedReader(
                       new InputStreamReader(connection1.getInputStream()));
               String line;
               while ((line = in.readLine()) != null) {
                   result += line;
               }
           } catch (Exception e) {
               System.out.println("发送 POST 请求出现异常！" + e);
               e.printStackTrace();
           }
           //使用finally块来关闭输出流、输入流
           finally {
               try {
                   if (out != null) {
                       out.close();
                   }
                   if (in != null) {
                       in.close();
                   }
               } catch (IOException ex) {
                   ex.printStackTrace();
               }
           }

           return result;


       }





//       public static  String jsonPost(String urlstr,Map<String,String>params{
//
//
//           try {
//               URL url = new URL(urlstr);// 创建连接
//               HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//               connection.setDoOutput(true);
//               connection.setDoInput(true);
//               connection.setUseCaches(false);
//               connection.setInstanceFollowRedirects(true);
//               //设置请求方式
//               connection.setRequestMethod("POST");
//               connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
//               connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
//               connection.connect();
//
//               OutputStreamWriter out =new OutputStreamWriter(connection.getOutputStream(),"utf-8");
//
//               out.append((JSONUtil.object2JsonString())
//
//







//
//           }catch (Exception e4){
//               e4.printStackTrace();
//
//
//
//           }



       //执行get请求过程
       public static void main(String args[]){
          // String s = postman_nature.sendGet("http://qa.zgyjyx.net/api/parents/question/?action=get_question_types");
           String url ="http://qa.zgyjyx.net/api/student/mobile/login/";
           //Map<String,String> m =new HashMap<String,String>();
           Map m1 =new HashMap();
           m1.put("username","15067118511");
          m1.put("ostype",0);
         m1.put("password",888888);
         m1.put("devicetoken","AhWIsLjwvdP42WXGPkwbIqvaolCMacSVQj8DQddkA5Nq");

           System.out.println(postman_nature.sendPost(url,m1));



       }







}


