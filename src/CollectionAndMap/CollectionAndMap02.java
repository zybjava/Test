package CollectionAndMap;

import java.util.*;

public class CollectionAndMap02 {
    public static void main(String[] args) {
        Map<Person,String> map=new HashMap<Person,String>();//乱序
        map.put(new Person("zyb",20),"zhangyunbin");
        map.put(new Person("zyb",20),"zhangyunbin");
        map.put(new Person("fzh",21),"fengzhihui");
        map.put(new Person("fzh",21),"fengzhihui");
        Set<Map.Entry<Person,String>> set=map.entrySet();
        Iterator<Map.Entry<Person,String>> iter= set.iterator();
        while (iter.hasNext()){
            Map.Entry<Person,String> me=iter.next();
            System.out.println(me.getKey()+"->"+me.getValue());
        }
    }
}
class Person{//重写Object类方法，自定义类
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(!(obj instanceof Person))
            return false;
        Person p=(Person) obj;
        if(this.name==p.name&&this.age==p.age){
            return true;
        }else
            return false;
    }
    public int hashCode(){
        return this.name.hashCode()*this.age;
    }
    public String toString(){
        return "名字："+this.name+";"+"年龄："+this.age;
    }
}
