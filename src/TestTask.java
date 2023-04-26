import javax.imageio.ImageTypeSpecifier;
import java.text.*;
import java.util.*;
public class TestTask {
    public static void main(String[] args) {
        Timer t=new Timer();
        MyTask myTask=new MyTask();
        t.schedule(myTask,1000,1000);
    }
}
class MyTask extends TimerTask{
    public void run(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        System.out.println("当前的系统时间是："+sdf.format(new Date()));
    }
}