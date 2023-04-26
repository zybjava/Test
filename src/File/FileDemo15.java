package File;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileDemo15 {
    public static void main(String[] args) throws Exception{
        DataInputStream dis=new DataInputStream(new FileInputStream(new File("d:"+File.separator+"File"+File.separator+"test.txt")));
        String name=null;
        float prices=0.0f;
        int num=0;
        char temp[]=null;
        char c=0;
        int len=0;
        try {
            while (true){
                temp=new char[200];
                len=0;
                while ((c=dis.readChar())!='\t'){
                    temp[len]=c;
                    len++;
                }
                name=new String(temp,0,len);
                prices=dis.readFloat();
                dis.readChar();
                num=dis.readInt();
                dis.readChar();
                System.out.printf("名称： %s; 价格： %5.2f; 数量： %d\n",name,prices,num);
            }
        }catch (Exception e){

        }
        dis.close();
    }
}
