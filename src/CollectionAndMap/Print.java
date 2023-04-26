package CollectionAndMap;

import java.util.*;
public class Print {
    public static void main(String[] args) {
        List<String> allList=new ArrayList<String>();
        allList.add("hello");
        allList.add("_");
        allList.add("zyb");
        Iterator<String> iter=allList.iterator();
        while (iter.hasNext()){
            String str=iter.next();
            if("_".equals(str)){
                iter.remove();//这样是删除当前的内容
                //allList.remove(str);//这样用集合删除将会直接导致集合少了一个元素，后面的iter.hasnext()将会查不到它的下一个元素
            }else{
                System.out.print(str+"、");
            }
        }
        System.out.println("\n 删除之后的集合"+allList);
    }
}
