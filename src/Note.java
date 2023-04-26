public class Note {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();
        Process pro=null;
        try{
            pro=run.exec("notepad.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        pro.destroy();
    }
}
