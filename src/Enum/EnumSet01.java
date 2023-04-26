package Enum;

import java.util.EnumSet;

public class EnumSet01 {
    public static void main(String[] args) {
        EnumSet<Color> es=EnumSet.allOf(Color.class);//EnumSet比较特殊，他却又很多方法，全都是静态的，
        // 因此已经早已实例化不必new了直接使用它的方法就好，allOf是加入所有的枚举，也是有noneOf和all的
        //还有complementOf是说明创建不包含指定元素的集合,esNew=EnumSet.complementOf(es);
        //还有一个copyOf可以复制集合内容到新集合中
        print(es);
    }
    public static void print(EnumSet<Color> t){
        for (Color c:t){
            System.out.print(c+"、");
        }
    }
}
enum Color{
    Red,Green,Blue;
}
