package CollectionAndMap;

import java.util.*;

public class CollectionAndMap01 {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<String>();
        set.add("zyb");
        set.add("handsome");
        set.add("fzh");
        set.add("beautiful");
        set.add("pig");
        System.out.println(set);
        //Collections.reverse(set);
        Iterator<String> iter=set.iterator();
        while (iter.hasNext()){
            String str= iter.next();
            if("pig".equals(str))
                iter.remove();
            else
                System.out.print(str+"、");
        }
    }
}
