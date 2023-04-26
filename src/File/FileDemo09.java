package File;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class FileDemo09 {
    public static void main(String[] args) {
        Send s=new Send();
        Receive r=new Receive();
        try{
            s.getPos().connect(r.getPis());
        }catch (IOException e){
            e.printStackTrace();
        }
        new Thread(s).start();
        new Thread(r).start();
    }
}
class Send implements Runnable {
    private PipedOutputStream pos=null;
    public Send(){
        this.pos=new PipedOutputStream();
    }
    @Override
    public void run() {
        String str="zyb is the best handsome boy!";
        try{
            this.pos.write(str.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            this.pos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public PipedOutputStream getPos(){
        return pos;
    }
}
class Receive implements Runnable{
    private PipedInputStream pis=null;
    public Receive(){
        this.pis=new PipedInputStream();
    }

    @Override
    public void run() {
     byte b[]=new byte[1024];
     int len=0;
     try{
         len=this.pis.read(b);
     }catch (IOException e){
         e.printStackTrace();
     }
     try{
         this.pis.close();
     }catch (IOException e){
         e.printStackTrace();
     }
        System.out.println("接收的内容是："+new String(b,0,len));
    }
    public PipedInputStream getPis(){
        return pis;
    }
}