import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n<=1){
            return n;
        }else{
            if(n%2==0){
              return  n+fun(n/2);
            }
            else{
              return  fun((n+1)/2) + fun((n-1)/2);
            }
        }
    }
}
