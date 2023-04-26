package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileDemo18 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        OutputStream out=new FileOutputStream(f,true);
        byte b[]="张允斌最帅".getBytes("GBK");
        out.write(b);
        out.close();
    }
}
