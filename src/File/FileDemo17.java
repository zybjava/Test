package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class FileDemo17 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"File");
        File zipFile=new File("d:"+File.separator+"Filedir.zip");
        InputStream in=null;
        ZipOutputStream zip=new ZipOutputStream(new FileOutputStream(zipFile));
        zip.setComment("www.zyb.java.cn");
        if(f.isDirectory()){
            File list[]=f.listFiles();
            for(int i=0;i<list.length;i++){
                in=new FileInputStream(list[i]);
                zip.putNextEntry(new ZipEntry(f.getName()+File.separator+list[i].getName()));
                int temp=0;
                while ((temp=in.read())!=-1){
                    zip.write(temp);
                }
                in.close();
            }
        }
        zip.close();
    }
}
