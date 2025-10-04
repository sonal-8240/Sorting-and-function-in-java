import java.util.*;
public class Sumfunction_02 {
public static int factorial(int m){
    if(m<=0){
        System.out.println("Invalid input");
    }
    int fact=1;
    for(int i=m;i>=1;i--){
         fact=fact*i;
    }
   return fact;
}
    public static void product(int n,int m){
        int product=m*n;
        System.out.println(product);
    }
    public static int AddNumber(int n,int m){
        int sum=n+m;
        return sum ;

    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the Number1 And Number2");
        int num1=read.nextInt();
        int num2=read.nextInt();
        System.out.println( AddNumber(num1,num2));
product(num1,num2);
System.out.println(factorial(-5));

    }

}
