package File;

import java.io.*;

public class FileDemo16 {
    public static void main(String[] args) throws Exception{
        InputStream is1=new FileInputStream("d:"+ File.separator+"File"+File.separator+"test.txt");
        InputStream is2=new FileInputStream("d:"+ File.separator+"File"+File.separator+"test1.txt");
        SequenceInputStream sis=new SequenceInputStream(is1,is2);
        OutputStream os=new FileOutputStream("d:"+File.separator+"File"+File.separator+"test2.txt");
        int temp=0;
        while ((temp=sis.read())!=-1)
            os.write(temp);
        sis.close();
        is1.close();
        is2.close();
        os.close();
    }
}
