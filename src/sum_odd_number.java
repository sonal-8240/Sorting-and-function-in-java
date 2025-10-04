import java.util.*;
public class sum_odd_number {
public static int Greater_number(int m,int n){
    if(m>n){
        return m;
    }
    else{
        return n;
    }

}
    public static void odd_numberr_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){

            if(i%2==1){
                sum+=i;


            }

        }
        System.out.println("the sum of the number n odd number is"+sum);
    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the value of the n");
        int n=read.nextInt();
        odd_numberr_sum(n);
System.out.println(Greater_number(3,5));
    }
}
