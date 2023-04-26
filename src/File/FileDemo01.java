package File;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f=new File("d:"+File.separator);
//        File files[]=f.listFiles();
//        for(int i=0;i<files.length;i++){
//            System.out.println(files[i]);
//        }
        print(f);
    }
    public static void print(File file){
        if(file!=null){
            if(file.isDirectory()){
                File f[]=file.listFiles();
                if(f!=null){
                    for(int i=0;i<f.length;i++){
                        print(f[i]);
                    }
                }
            }else
                System.out.println(file);
        }
    }
}
