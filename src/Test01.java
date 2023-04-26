import javax.swing.table.TableRowSorter;
import java.util.*;
import java.lang.reflect.*;
public class Test01 {
    public static void main(String[] args){
//        Students1 stu=new Students1(001,"zyb",100);
//        System.out.println(stu);
        Class<?> c=null;
        try{
            c=Class.forName("Students1");
        }catch (Exception e){
            e.printStackTrace();
        }
        Students1 stu=null;
        Constructor<?> con[]=null;
        Object obj=null;
        con=c.getConstructors();
        try{
            stu=(Students1) con[1].newInstance(001,"zyb",100);//构造方法
            obj=con[0].newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        //Object obj=c.newInstance();
        System.out.println(stu);
        Method m[]=c.getMethods();
        for(int i=0;i<m.length;i++){
            Class<?> r=m[i].getReturnType();
            Class<?> p[]=m[i].getParameterTypes();
            int x=m[i].getModifiers();
            System.out.print(Modifier.toString(x)+" ");
            System.out.print(r.getName()+" ");
            System.out.print(m[i].getName()+" ");
            System.out.print("(");
            for(int j=0;j<p.length;j++){
                System.out.print(p[j].getName()+" "+"arg"+j);
                if(x<p.length-1){
                    System.out.print(",");
                }
            }
            Class<?> ex[]=m[i].getExceptionTypes();
            if(ex.length>0){
                System.out.print(")throws ");
            }else{
                System.out.print(")");
            }
            for(int k=0;k<ex.length;k++){
                System.out.print(ex[k].getName());
                if(k<ex.length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
        setter(obj,"name","fzh",String.class);
        getter(obj,"name");

        // System.out.println(stu);
    }
    public static String initSTr(String old){
        String str=old.substring(0,1).toUpperCase()+old.substring(1);
        return str;
    }
    public static void getter(Object obj,String att){
        try{
            Method met=obj.getClass().getMethod("get"+initSTr(att));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void setter(Object obj,String att,Object value,Class<?> type){
        try{
            Method met=obj.getClass().getMethod("set"+initSTr(att));
            met.invoke(obj,value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}