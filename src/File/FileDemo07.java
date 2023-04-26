package File;

import java.io.*;

public class FileDemo07 {
    public static void main(String[] args) throws Exception{
        if(args.length!=2){
            System.out.println("输入参数不正确！");
            System.out.println("例如：Java Copy 源文件路径 目标文件路径");
            System.exit(1);
        }
        File f1=new File(args[0]);
        File f2=new File(args[1]);
        if(!f1.exists()){
            System.out.println("路径不存在！");
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
                System.out.println("复制成功");
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("复制失败");
            }
        }
        in.close();
        out.close();
    }
}
