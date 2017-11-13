package com.yjyx.postman;


import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * httpclient工具类
 */

public class poster {

    private String username;
    private String password;
    final int ostype = 0;
    public String devicetoken;


    /**
     * 发送get请求
     *
     * @return
     */
    public static void sendget() {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpGet httpget = new HttpGet("http://qa.zgyjyx.net/api/student/mobile/login/");
        CloseableHttpResponse httpresponse = null;


        try {
            httpresponse = httpclient.execute(httpget);

        } catch (IOException e1) {
            e1.printStackTrace();

        }
        String result = null;

        HttpEntity entiry = httpresponse.getEntity();


        try {
            if (entiry != null) {
                //重写toString方法
                result = EntityUtils.toString(entiry);
                System.out.println(result);
                System.out.println("111");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpresponse.close();

            } catch (Exception e1) {
                e1.printStackTrace();
            }

        }


    }
    public static String sendpost() {

        String login = null;
        CloseableHttpClient httpclient = null;
        HttpPost post = null;
        try {
            login = "http://qa.zgyjyx.net/api/parents/login/";

            httpclient = HttpClients.createDefault();

            post = new HttpPost(login);
            List<NameValuePair> nvps =new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("username","13803544685"));
            nvps.add(new BasicNameValuePair("ostype","0"));
            nvps.add(new BasicNameValuePair("password","888888"));
            nvps.add(new BasicNameValuePair("devicetoken","'AqTq9b6AfWWxnJjICYPBa6G9dp4sJEU_TwCNNpXfE0zK'"));
            System.out.println("结果集是"+nvps);
            UrlEncodedFormEntity factory =new UrlEncodedFormEntity(nvps);
            post.setEntity(factory);


            System.out.println("哈哈哈哈哈哈哈");


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try {
            HttpResponse response = httpclient.execute(post);
            System.out.println("发送post....");

            HttpEntity entity = response.getEntity();
            if(entity!=null){

                System.out.println("the body is :"+EntityUtils.toString(entity));

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

//        CloseableHttpResponse response = null;
//        try {
//            response = httpclient.execute(post);
//
//        } catch (IOException e1) {
//            e1.printStackTrace();
//
//        }
//        System.out.println("cccccccc");
//        String result = null;

//
//        HttpEntity entiry = response.getEntity();
//
//
//        try {
//            List<NameValuePair> name = new ArrayList<NameValuePair>();
//            JSONObject json = new JSONObject();
//            json.put("username", username);
//            json.put("password", password);
//            json.put("ostype", ostype);
//            json.put("devicetoken", devicetoken);
//            name.add(new BasicNameValuePair("msg", getStringFromJson(json)));
//
//
//            try {
//                if (entiry != null) {
//                    //重写toString方法
//                    result = EntityUtils.toString(entiry);
//                    System.out.println("111");
//                    System.out.println(result);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    response.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return result;
//
//
//            }


//        private static String getStringFromJson(JSONObject adata){
//            StringBuffer sb = new StringBuffer();
//            sb.append("{");
//            for (Object key : adata.keySet()) {
//                sb.append("\"" + key + "\":\"" + adata.get(key) + "\",");
//            }
//            String rtn = sb.toString().substring(0, sb.toString().length() - 1) + "}";
//            return rtn;
//
//        }
//


//        public static void main(String[] args) {
//
//        //poster.sendget();
//        //System.out.println(poster.sendpost());
//        poster.sendpost();
//    }
//
        return login;

    }


    public static void main(String[] args) {
           poster.sendpost();
    }

}







