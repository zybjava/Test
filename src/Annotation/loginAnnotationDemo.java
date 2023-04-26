package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.io.*;
import java.lang.reflect.*;

@Target(ElementType.METHOD)//只在方法中有效，不过也可以不要它的
@Retention(RetentionPolicy.RUNTIME)//运行时有效
@interface LoginInfo{
    public String name() default "null";
    public String password() default "null";
}

class Check{
    private String name;
    private String password;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//获取账号密码
    public String getName() throws Exception{
        System.out.println("请输入名字：");
        name=br.readLine();
        return name;
    }
    public String getPassword() throws Exception{
        System.out.println("请输入密码：");
        password=br.readLine();
        return password;
    }
    @LoginInfo(name="zyb",password = "123456")
    public boolean login(String name,String password){
        boolean flag=false;
        Method m=null;
        try
        {//Check的.class也是3种反射实例的其中一种，当然也可以forName
            m=Check.class.getMethod("login",String.class,String.class);//使用反射取得Login方法
        }catch (Exception e){
            e.printStackTrace();
        }
        LoginInfo l=m.getAnnotation(LoginInfo.class);//在login被反射实例之后取得login的自定义注解
        if(l.name().equals(name)&&l.password().equals(password)){
            flag=true;
        }
        return flag;
    }
}


public class loginAnnotationDemo {
    public static void main(String[] args) throws Exception {
        String name;
        String password;
        Check c=new Check();
        name=c.getName();
        password=c.getPassword();
        if(c.login(name,password)==true){
            System.out.println("账号密码输入正确！");
        }else
            System.out.println("账号密码输入错误！");
    }
}
