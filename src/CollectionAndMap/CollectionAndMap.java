package CollectionAndMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class CollectionAndMap {
    public static void main(String[] args) throws Exception{
        Properties pro=new Properties();
        pro.setProperty("zyb","handsome");
        pro.setProperty("fzh","beautiful");
        pro.setProperty("parent","rich");
        File f=new File("d:"+File.separator+"File"+File.separator+"area.properties");
        pro.store(new FileOutputStream(f),"Area Info");
        pro.load(new FileInputStream(f));//xml文件和属性文件差不多的做法
        System.out.println(pro.getProperty("zyb"));
    }
}
