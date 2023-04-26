import java.util.*;
import java.io.*;
public class Students02 {
    public static void main(String[] args) throws Exception {
        File f=new File("C:"+File.separator+"students.txt");
        //OutputStream out=new FileOutputStream(f);
        OutputStream out = new FileOutputStream(f.exists() ? f : new File("C:" + File.separator + "students.txt"), true);
        mate stu1=new mate(001,"zyb",143);
        mate stu2=new mate(004,"fzh",144);
        mate stu3=new mate(002,"baba",198);
        mate stu4=new mate(003,"mama",78);
        mate stu5=new mate(006,"sb",98);
        Map<String,mate> map=new HashMap<String,mate>();
        map.put("1",stu1);
        map.put("2",stu2);
        map.put("3",stu3);
        map.put("4",stu4);
        map.put("5",stu5);
        String str=map.toString();
        byte b[]=str.getBytes();
        out.write(b);
        out.close();
        mate val=map.get("1");
        System.out.println("1号学生信息："+val);
        System.out.println("全部学生信息：");
        Collection<mate> values=map.values();
        Iterator<mate> iter=values.iterator();
        while (iter.hasNext()){
            mate str1=iter.next();
            System.out.println(str1);
        }
    }
}
class mate{
    private int code;
    private String name;
    private int score;
    public mate(int code,String name,int score){
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
    public String toString(){
        return "学号"+this.getCode()+"\t姓名"+this.getName()+"\t分数"+this.getScore()+"\n";
    }
}