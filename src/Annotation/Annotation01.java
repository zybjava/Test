package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Annotation01 {
    public static void main(String[] args) throws Exception {
        String name=null;
        String password=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        if(sc.hasNext())
            name=sc.next();
        System.out.println("请输入密码：");
        if(sc.hasNext())
            password=sc.next();
        if(new Login().login(name,password)){
            System.out.println("登录成功！");
        }else
            System.out.println("用户名或者密码输入错误");
    }
}
@Retention(value = RetentionPolicy.RUNTIME)
@interface LoginInfo1{
    public String name() default "用户名";
    public String password() default "密码";
}
class Login{
    @LoginInfo1(name = "用户名",password = "密码")
    public boolean login(String name,String password)throws Exception{
        Class<?> c=Class.forName("Annotation.Login");
        Method m=c.getMethod("login",String.class,String.class);
        LoginInfo1 ann=m.getAnnotation(LoginInfo1.class);
        if((ann.name()).equals(name)&&(ann.password()).equals(password))
            return true;
        else return false;
    }
}