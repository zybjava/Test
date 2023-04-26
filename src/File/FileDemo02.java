package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileDemo02 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        //f.createNewFile();//文件会自动产生，因此不需要createNewFile也是可以的
        OutputStream out=null;
        out=new FileOutputStream(f,true);//另一个构造方法，如果不加后面的“,true”，一般就是false，不允许在后面追加内容
        String str="\r\nzyb is the best handsome!";// \r\n 就是在文本后面换行追加内容
        byte b[]=str.getBytes();
        out.write(b);
        out.close();
    }
}
