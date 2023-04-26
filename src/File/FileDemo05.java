package File;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileDemo05 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        Writer out=new FileWriter(f,true);//字符流和字节流一样的做法就是类不一样而已
        String str="\r\nzyb is the best handsome!";
        out.write(str);
        out.close();
    }
}
