package CollectionAndMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionAndMap03 {//多对多关系类集
    public static void main(String[] args) {
        Cource c1=new Cource("英语",3);
        Cource c2=new Cource("计算机",5);
        Student s1=new Student("zyb",20);
        Student s2=new Student("fzh",21);
        Student s3=new Student("parent",50);
        //第一门课程和学生的多对多关系加入
        c1.getAllStudent().add(s1);
        c1.getAllStudent().add(s2);
        s1.getAllCources().add(c1);
        s2.getAllCources().add(c1);
        //第二门课程和学生的多对多关系加入
        c2.getAllStudent().add(s1);
        c2.getAllStudent().add(s2);
        c2.getAllStudent().add(s3);
        s1.getAllCources().add(c2);
        s2.getAllCources().add(c2);
        s3.getAllCources().add(c2);
        System.out.println(c1);
        Iterator<Student> iter=c1.getAllStudent().iterator();
        while (iter.hasNext()){
            Student s=iter.next();
            System.out.println("\t|-"+s);
        }
        System.out.println(s2);
        Iterator<Cource> iter2=s2.getAllCources().iterator();
        while (iter2.hasNext()){
            Cource c=iter2.next();
            System.out.println("\t|-"+c);
        }
    }
}
class Student{
    private String name;
    private int age;
    private List<Cource> allCources;
    public Student(){
        this.allCources=new ArrayList<Cource>();
    }
    public Student(String name,int age){
        this();
        this.setName(name);
        this.setAge(age);
    }
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
    public List<Cource> getAllCources(){
        return allCources;
    }
    public String toString(){
        return "学生姓名："+this.name+"；年龄："+this.age;
    }
}
class Cource{
    private String name;
    private int credit;
    private List<Student> allStudent;
    public Cource(){
        this.allStudent=new ArrayList<Student>();
    }
    public Cource(String name,int credit){
        this();
        this.setName(name);
        this.setCredit(credit);
    }

    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }
    public String toString(){
        return "课程名称："+this.name+"；课程学分："+this.credit;
    }
}
