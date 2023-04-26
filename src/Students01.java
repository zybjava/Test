import java.util.*;

public class Students01 {
    public static void main(String[] args) {
        Set<Students1> all=new TreeSet<Students1>();
        all.add(new Students1(001,"fzh",102));
        all.add(new Students1(004,"zyb",123));
        all.add(new Students1(003,"mama",12));
        all.add(new Students1(002,"baba",15));
        System.out.println(all);
        List<Students1> a=new ArrayList<Students1>();
        a.add(new Students1(001,"fzh",102));
        a.add(new Students1(004,"zyb",123));
        a.add(new Students1(003,"mama",12));
        a.add(new Students1(002,"baba",15));
        System.out.println(a);//排序之前对于List是无序的
        Collections.sort(a);//所以要经过Collections类来排序
        System.out.println(a);//经过类方法之后就可以排序输出了，而且List是有双向输出的
        ListIterator<Students1> iter=a.listIterator();//双向输出要先有从前到后才会有从后到前的
        System.out.println("从前到后：");
        while (iter.hasNext()){
            Students1 s=iter.next();
            System.out.println(s);
        }
        System.out.println("从后到前：");
        while (iter.hasPrevious()){
            Students1 s1=iter.previous();
            System.out.println(s1.toString());
        }
    }
}
class Students1 implements Comparable<Students1>{
    private int code;
    private String name;
    private int score;
    public Students1(int code,String name,int score){
        this.setCode(code);
        this.setName(name);
        this.setScore(score);
    }
    public int getCode(){
        return this.code;
    }
    public void setCode(int code){
        this.code=code;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getScore(){
        return this.score;
    }
    public void setScore(int score){
        if(score>=0&&score<=150){
            this.score=score;
        }
    }
    public Students1(){

    }
    public String toString(){
        return "学号"+this.getCode()+"\t姓名"+this.getName()+"\t分数"+this.getScore()+"\n";
    }
    public int compareTo(Students1 stu){
        if(this.score>stu.score){//List是没有顺序的
            return -1;
        }
        else if(this.score<stu.score){//set才有顺序
            return 1;
        }else{
            return this.name.compareTo(stu.name);
        }
//        return Integer.compare(this.score,stu.getScore());
    }
}