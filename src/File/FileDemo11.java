package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FileDemo11 {
    public static void main(String[] args) throws Exception{
//        Scanner reader=new Scanner(System.in);
//        int a=reader.nextInt();
//        System.out.println(a);
        System.setIn(new FileInputStream("d:"+ File.separator+"File"+File.separator+"test1.txt"));
        InputStream in=System.in;
        byte b[]=new byte[1024];
        int len=in.read(b);
        System.out.println("输入的内容是："+new String(b,0,len));
        in.close();//字节流是没有缓存flush的，因此可以没有close，而字符流有，必须有close，不然数据在缓存区中，不会输出
    }
}
