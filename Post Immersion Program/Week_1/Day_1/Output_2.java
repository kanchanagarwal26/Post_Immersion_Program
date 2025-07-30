package Week_1.Day_1;

public class Output_2 {
    public static void main(String[] args) {
       
      System.out.println(fun(8,8))  ;
    
       

    
}
public static int  fun(int a,int b){
    if (a >0 && b >0  && a + b > 0) { 
            return a + fun(a - 2, b - 2) + b;
    }
    return a^b;
}

    
}
