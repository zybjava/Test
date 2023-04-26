import javax.swing.*;
import java.util.*;
import java.text.*;
public class InterDemo {
    public static void main(String[] args) {
        Locale zhLoc=new Locale("zh","CN");
        ResourceBundle zhrb=ResourceBundle.getBundle("Message",zhLoc);
        String str= zhrb.getString("info");
        System.out.println("中文："+MessageFormat.format(str,"zyb"));
    }
}
class Message_zh_CN extends ListResourceBundle{
    private final Object data[][]={
            {"info","您好,{0}"}
    };
    public Object[][] getContents(){
        return data;
    }
}
