import java.util.*;
public class Average_sum_3 {
    public static int Average_sum(int n,int m,int o){
        return (n+m+o)/3;

    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1=read.nextInt();
        int num2=read.nextInt();
        int num3=read.nextInt();
        System.out.println(Average_sum(num1,num2,num3));


    }
}
