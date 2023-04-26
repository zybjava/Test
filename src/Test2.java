import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<String> allList = new Vector<String>();//Vector是List的子类，向上转型
        allList.add("zyb");
        allList.add(0, "Hello");
        allList.add("you are the most handsome");//添增
        System.out.println(allList.contains("zyb"));
        for (int i = 0; i < allList.size(); i++) {
            System.out.print(allList.get(i) + ",");
        }
        System.out.println("");
        allList.remove("Hello");//移除
        allList.remove("hello");//如果没有，就是false，并不是错误
        for (int i = 0; i < allList.size(); i++) {
            System.out.print(allList.get(i) + ",");
        }
    }
}
