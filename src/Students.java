import java.util.*;
public class Students {
    public static void main(String[] args) {
        List<Stu> all=new ArrayList<Stu>();
        Scanner in=new Scanner(System.in);
        int i=1;
        while (i<=5){
            int a=in.nextInt();
            String b=in.next();
            int c=in.nextInt();
            all.add(new Stu(a,b,c));
            i++;
        }
        Collections.sort(all, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                return Integer.compare(o2.getGrade(),o1.getGrade());
            }
        });
        System.out.println(all);
    }
}
class Stu{
    private int code;
    private String name;
    private int grade;
    public Stu(int code,String name,int grade){
        this.code=code;
        this.name=name;
        this.grade=grade;
    }
    public void setCode(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade() {
        return grade;
    }
    public String toString(){
        return "code:"+this.getCode()+"\tname:"+this.getName()+"\tgrade:"+this.getGrade()+"\n";
    }
//    public int compareTo(Stu stu){
//        if(this.grade>stu.grade){
//            return 1;
//        }
//        else if(this.grade< stu.grade){
//            return -1;
//        }
//        else {
//            return this.name.compareTo(name);
//        }
//    }
}
