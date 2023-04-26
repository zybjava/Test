package CollectionAndMap;

import java.util.*;

public class KVMap {
    public static void main(String[] args) {
        Map<String, String> map = new WeakHashMap<String, String>();
        map.put(new String("zyb"), new String("handsome"));//因为创造了对象，导致有一个引用指向它，然而不使用这个对象的时候不需要它占用内存
        //map.put("zyb","handsome");
        System.out.println("内容：" + map);
        System.gc();
        map.put("fzh", "beautiful");//没有new String，将会导致其只是在常量池中产生，垃圾回收器不会回收常量池的，直接将引用指向常量池就好
        System.out.println("内容：" + map);
        Map<String,String> map1=new TreeMap<String,String>();
        map1.put("1、zyb","handsome");
        map1.put("5、mama","beautiful");
        map1.put("2、fzh","beautiful");
        map1.put("6、dad","handsome");
        Set<String> keys=map1.keySet();
        Iterator<String> iter=keys.iterator();
        while (iter.hasNext()){
            String str=iter.next();
            System.out.println(str+"->"+map1.get(str));
        }
    }
}
