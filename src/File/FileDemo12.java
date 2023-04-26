package File;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedMap;

public class FileDemo12 {
    public static void main(String[] args) throws Exception{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        System.out.println("请输入内容：");
        str=buf.readLine();
        System.out.println("输出的内容是："+str);
    }
}
