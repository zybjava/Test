package File;

import java.io.File;
import java.util.Scanner;

public class FileDemo13 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        Scanner s=new Scanner(f);
        StringBuffer buf=new StringBuffer();
        while (s.hasNext()){
            buf.append(s.next()).append(" ");//Scanner是有默认的分隔符的，就是空格
        }
        System.out.println(buf);
    }
}
