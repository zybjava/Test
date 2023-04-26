import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        Person per=new Person("zyb",19,"2003-02-09",sex.女);
        System.out.println(per);
        per.setSex(sex.男);
        System.out.println(per);
        per.setAge(119);
        System.out.println(per);
    }
}
class Person{
    private String name;
    private int age;
    private String birthday;
    private Enum sex;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday=birthday;
    }
    public Enum getSex(){
        return sex;
    }
    public void setSex(Enum sex){
        this.sex=sex;
    }
    public String toString(){
        return "名字："+name+"\t年龄"+age+"\t生日："+birthday+"\t性别："+sex;
    }
    public Person(String name,int age,String birthday,Enum sex){
        //super();
        this.name=name;
        this.age=age;
        this.birthday=birthday;
        this.sex=sex;
    }
}
enum sex{
    男,女;
}