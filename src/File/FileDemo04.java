package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileDemo04 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte b[]=new byte[(int)f.length()];//f.length()根据文件大小找出长度
        //in.read(b);
        for(int i=0;i<b.length;i++){//也可以这样字节一个个读入
            b[i]=(byte)in.read();
        }
        in.close();

        System.out.println("内容是："+new String(b));
    }
}
