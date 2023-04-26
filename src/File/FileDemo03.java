package File;
import java.io.*;
public class FileDemo03 {
    public static void main(String[] args) throws Exception {
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        InputStream in=new FileInputStream(f);//多态性
        byte b[]=new byte[128];//1.2.开辟一个字节数组空间
        //in.read(b);//1.内容取出，放进byte数组中

        int len=in.read(b);//2.在内容取出放进数组的基础上统计文本数据字节大小
        in.close();
        //1.System.out.println("内容是："+new String(b));

        System.out.println("读入的数据长度是："+len);//2.得到长度
        System.out.println("内容是："+new String(b,0,len));//2.根据长度输出文本数据
    }
}
