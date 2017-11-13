
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import sun.awt.windows.ThemeReader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * 配置chromedriver的环境    System.setProperty("webdriver.chrome.driver","D:\\Webdriver\\chromedriver.exe");
 */
public class auto_test1  {

    public static void main(String[] args) {
        auto_test1 qa = new auto_test1();
        qa.login_in();


    }


    public void login_in()throws IllegalStateException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://qa.zgyjyx.net/student/login/login.html";
        //访问学生端首页
        driver.get(baseURL);
        //输入账号和密码个人信息
        WebElement username = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/span/span[1]/input"));
        WebElement psd = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/span/span[2]/input"));

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/button"));

        //   WebElement pwd = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/input[2]"));


//        WebElement register = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/a[1]"));

        //Home Page
        WebElement myTask = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div[1]/ul/li[3]/a"));
        WebElement SelectBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div[1]/ul/li[3]/a"));


        //


        /**
         * 执行相应的浏览器操作  operotor
         *
         */
        //登录系统
        username.sendKeys("1");
        psd.sendKeys("888888");
        loginBtn.click();

        //我的任务-->"开始日期"

        myTask.click();
        SelectBox.click();


    }


}




        /**

        //对查看元素进行断言操作
        try {
            String inputText = username.getAttribute("value");
            System.out.println("登录页面的页面元素属性值是：" + inputText);

       //     Assert.assertEquals(inputText, "1");
        } catch (AssertionError e1) {
            e1.printStackTrace();
        }


        //进行时间间隔的休眠
        try {
            Thread.sleep(3000);
            psd.sendKeys("888888");
//                register.click();
            loginBtn.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

 **/










/**

    public void takeShot() {
        String baseURl = "http://www.qq.com";
        String x = "//*[@id=\"root\"]/div/div[2]/span/span[1]/input";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //     System.out.println("-->"+driver);
        driver.get(baseURl);
        try {

            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("C:\\Users\\win10\\Desktop\\work\\war1.png"));


        } catch (IOException E) {
            E.printStackTrace();

        } //需要捕获IO异常

   **/


    //判断页面元素是否存在？
//    public boolean isElementExists(By by) {
//
//        try {
//            driver1.findElement(by);
//            return true;
//
//        } catch (NoSuchElementException ele) {
//            ele.printStackTrace();
//        }
//        return false;
//
//    }












