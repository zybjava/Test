import java.util.*;
public class Reverable {
    public static void main(String[] args) {
        int x;
        Scanner reader=new Scanner(System.in);
        x=reader.nextInt();
        System.out.println(isPrime(x));
    }
    public static boolean isPrime(int x){
        if(x<0||x%10==0&&x!=0){
            return false;
        }
        int temp=0;
        while (x>temp){
            temp=temp*10+x%10;
            x/=10;
        }
        return x==temp||temp/10==x;
    }
}

