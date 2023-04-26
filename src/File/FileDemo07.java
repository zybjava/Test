package File;

import java.io.*;

public class FileDemo07 {
    public static void main(String[] args) throws Exception{
        if(args.length!=2){
            System.out.println("�����������ȷ��");
            System.out.println("���磺Java Copy Դ�ļ�·�� Ŀ���ļ�·��");
            System.exit(1);
        }
        File f1=new File(args[0]);
        File f2=new File(args[1]);
        if(!f1.exists()){
            System.out.println("·�������ڣ�");
            System.exit(1);
        }
        InputStream in=new FileInputStream(f1);
        OutputStream out=new FileOutputStream(f2);
        if(in!=null&&out!=null){
            int t=0;
            try {
                while ((t=in.read())!=-1){
                    out.write(t);
                }
                System.out.println("���Ƴɹ�");
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("����ʧ��");
            }
        }
        in.close();
        out.close();
    }
}
