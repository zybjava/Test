package File;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class FileDemo08 {
    public static void main(String[] args) throws Exception{
        String str="HELLO WORLD";
        ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        int t=0;
        while ((t=bis.read())!=-1){
            char c=(char) t;
            bos.write(Character.toLowerCase(c));
        }
        String newStr=bos.toString();
        bis.close();
        bos.close();
        System.out.println(newStr);
    }
}
