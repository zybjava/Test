public class Memory {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();
        System.out.println(run.maxMemory());
        System.out.println(run.freeMemory());
        String str="Hello"+"zyb"+"\n"+"Welcome you to this demo!";
        System.out.println(str);
        run.gc();
        System.out.println(run.freeMemory());
        for(int i=0;i<1000;i++){
            str+=i;
        }
        System.out.println(str);
        System.out.println(run.freeMemory());
        run.gc();
        run.gc();
        System.out.println(run.freeMemory());
    }
}
