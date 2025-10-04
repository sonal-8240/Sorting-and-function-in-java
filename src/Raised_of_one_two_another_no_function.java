import java.util.*;
public class Raised_of_one_two_another_no_function {
    public static double  power_ofnumber(int n,int m){
        double power=Math.pow(n,m);
        return power;

    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=read.nextInt();
        int x=read.nextInt();

        System.out.println(power_ofnumber(n,x));
    }

}
