import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(fun(n,m));
    }
    public static int fun(int n,int m){
        if(m==0||m==n){
            return 1;
        }
        return fun(n-1,m)+fun(n-1,m-1);
        }
    
}


input 5,3
  output 10
