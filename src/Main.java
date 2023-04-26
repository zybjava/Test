import java.util.Random;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.getProperties().list(System.out);
        //System.out.println(System.getProperties("os.name"));
        //System.out.println(new Random().nextInt(10));//需要new一个实例才可以使用
        Random r=new Random();
        List<Integer> myList=new ArrayList<Integer>();
//        for(int i=0;i<7;i++){
//            System.out.print(1+r.nextInt(35)+"\t");
//        }
        while (myList.size()<7){
            int num=r.nextInt(35)+1;
            if(!myList.contains(num)){
                myList.add(num);
            }
        }
//        Iterator<Integer> iter=myList.iterator();//第一种方法Iterator输出
//        while (iter.hasNext()){
//            int a= iter.next();
//            System.out.print(a+"、");
//        }
        for(int a:myList){
            System.out.print(a+"、");
        }
    }
}