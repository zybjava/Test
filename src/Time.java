import java.util.*;
import java.text.*;
public class Time {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println("现在时间是："+date);
        DateFormat dsf=DateFormat.getDateTimeInstance();
        System.out.println("DateTime:"+dsf.format(new Date()));
        DateTime dt=new DateTime();
        System.out.println("系统日期："+dt.getDate());
        System.out.println("中文日期："+dt.getDateZn());
        System.out.println("时间："+dt.getDateStamp());
    }
}
class DateTime{
    private SimpleDateFormat sdf=null;
    public String getDate(){
        this.sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
        return this.sdf.format(new Date());
    }
    public String getDateZn(){
        this.sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒.SS毫秒");
        return this.sdf.format(new Date());
    }
    public String getDateStamp(){
        this.sdf=new SimpleDateFormat("yyyyMMddHHmmssSS");
        return this.sdf.format(new Date());
    }
}