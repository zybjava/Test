package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileDemo10 {
    public static void main(String[] args) throws  Exception{
        PrintStream ps=new PrintStream(new FileOutputStream("d:"+ File.separator+"File"+File.separator+"test.txt",true));
        ps.print("\r\nhello ");
        ps.print("zyb and fzh,you are love ");
        ps.print("1+1="+2);
    }
}
