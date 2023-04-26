import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        List<String> all=null;
        Collection<String> allC=null;
        all=new ArrayList<String>();
        allC=new ArrayList<String>();
        all.add("Hello");
        all.add(0,"World");
        System.out.println(all);
        allC.add("LXH");
        allC.add("www.mldn.cn");
        all.addAll(allC);
        all.addAll(0,allC);
        System.out.println(all);
    }
}
