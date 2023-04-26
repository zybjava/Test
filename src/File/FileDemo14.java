package File;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FileDemo14 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File"+File.separator+"test.txt");
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(f));
        String names[]={"衣服","手套","围巾"};
        float prices[]={98.3f,30.3f,50.5f};
        int nums[]={1,2,3};
        for(int i=0;i<3;i++){
            dos.writeChars(names[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');
        }
        dos.close();
    }
}
