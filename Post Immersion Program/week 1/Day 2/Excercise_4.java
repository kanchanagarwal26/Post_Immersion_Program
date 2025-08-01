import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(fun(n,m));
    }
    public static int fun(int n,int m){
        if(m==n){
            return m*n;
        }
        return fun(n,(n+m)/2)+ fun(((n+m)/2+1),m);
        }
    
}

input 2,7
  output 139
