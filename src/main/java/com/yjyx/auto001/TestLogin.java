package com.yjyx.auto001;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.krb5.internal.PAData;
//导入必要的包
import com.yjyx.auto001.P;

/**
 * 主登录测试类\
 */
public class TestLogin {


    public WebDriver driver;
    public String url1 ="http://qa.zgyjyx.net/student/login";
    public String url2;




    public TestLogin(){


    }




    //主动抛出空指针的异常信息
    public void test() throws InterruptedException,NullPointerException{

        //实例化新的对象
        P qa = new P();
        //qa.login();
        qa.freshPage1(url1);
        qa.freshPage();

    //    qa.freshPage(url1);
     //   qa.inputText();


  //      qa.loginin();


//        System.out.println("locATOR IS :"+qa.username);
//        System.out.println("locA IS :"+qa.password);


//        qa.username.sendKeys("1");
//
//        qa.password.sendKeys("888888");


        qa.exit();


    }




    public static void main(String args[])throws Exception {
        TestLogin qq = new TestLogin();
        qq.test();


//        for(int i=0;i<=20;i++){
//            qq.test();
//
//        }
        System.out.println("本次测试执行结束");

    }









}


