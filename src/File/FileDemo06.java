package File;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileDemo06 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        Reader re=new FileReader(f);
        int len=0;
        char c[]=new char[1024];
        int temp=0;
        while ((temp=re.read())!=-1){
            c[len]=(char)temp;
            len++;
        }
        re.close();//字符流是需要缓存的所以一定需要关闭才可以输出内容
        System.out.println(len);
        System.out.println("内容是："+new String(c,0,len));
    }
}
