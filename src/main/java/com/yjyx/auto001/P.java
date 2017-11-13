package com.yjyx.auto001;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//*[@id="root"]/div/div[2]/span/span[1]/input




public class P {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/span/span[1]/input")
    public WebElement username;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/span/span[2]/input")
    public WebElement password;

    public WebDriver driver;
    public String u2;

    public String u ="http://www.baidu.com";
    public String pageTitle;



    private String url = "http://qa.zgyjyx.net/student/login";
    public String value2 = "888888";
    public String value1 = "1";







    /**   定义构造函数 （无参数的和传递参数的构造器）
     *
     *   // driver = new ChromeDriver();    需要对声明好的driver进行进一步的赋值，否则会返回NULL类型
     WebDriver driver =new ChromeDriver();
     * @param
     */
    //定义无参数构造器
    public P() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();

        // WebDriver driver =new ChromeDriver();
        PageFactory.initElements(driver, this);


    }

      //定义有参构造器
//    public P(WebDriver d) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
//        driver = new ChromeDriver();
//        d = new ChromeDriver();
//
//        // WebDriver driver =new ChromeDriver();
//        PageFactory.initElements(d, this);
//
//
//    }


    //定义有参构造器

    /**
     *
     * @param d webdriver实例对象，用来驱动浏览器.exe程序
     */
    public P(WebDriver d) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
     //?   d = new ChromeDriver();
        // WebDriver driver =new ChromeDriver();
        PageFactory.initElements(driver, this);


    }




    //    public P(WebElement username,WebElement password){
//        this.username =username;
//        this.password =password;
//

//    }


    /**
     *
     * 封装常见的api操作
     */

    //driver的值为null
    public void login() {
        driver.get(url);


    }
    //进行元素等待的休眠
    //public void waitMoment(){


  // }



    public void exit() {
        driver.quit();

    }


    //输入用户名
    public void inputText() {
        username.sendKeys(value1);


    }
    //输入密码
    public void Inputpassword(){
        password.sendKeys(value2);
    }


    //进行时间间隔的休眠
    public void delayTime(){

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //获取网页的标题内容
    public void getCaptial(){

        String pageTitle =driver.getTitle();
        System.out.println(pageTitle);

    }



    public void freshPage1(String u2){

        driver.navigate().to(u2);

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();


    }


    //不需要传递任何形参数，由之前定义好的类变量来赋值
    public void freshPage(){

        driver.navigate().to(u);

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();


    }







}


