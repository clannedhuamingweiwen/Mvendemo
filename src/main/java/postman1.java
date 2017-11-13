import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class postman1 {
    public static void main(String args[])throws IOException{
        //新建httpclient对象 httpclent
        CloseableHttpClient httpclient=HttpClients.createDefault();
        HttpGet get =new HttpGet("http://qa.zgyjyx.net/teacher/login/login.html");

        //处理请求结果
        CloseableHttpResponse res =httpclient.execute(get);
        System.out.println(res.hashCode());


        //post请求
        HttpPost post =new HttpPost();









    }





}
