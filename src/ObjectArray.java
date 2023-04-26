import java.util.*;
public class ObjectArray {
    public static void main(String[] args) {
        Student stu[]={new Student("zhangsan",20,90.0f),new Student("lisi",22,90.0f),new Student("zhaoliu",20,70.0f),new Student("wangwu",20,99.0f),new Student("sunqi",22,100.0f)};
        Arrays.sort(stu);
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i]);
        }
    }
}
//interface Comparable<T>{
//    int compareTo(T o);
//}
class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;
    public Student(String name,int age,float score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public String toString(){
        return name+"\t\t"+age+"\t"+score;
    }
    public int compareTo(Student stu){
        if(this.score> stu.score){
            return -1;
        }else if(this.score< stu.score){
            return 1;
        }else{
            if(this.age>stu.age){
                return 1;
            }else if(this.age<stu.age)
                return -1;
            else
                return 0;
        }
    }
}