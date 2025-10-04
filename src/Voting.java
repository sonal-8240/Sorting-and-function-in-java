import java.util.*;
public class Voting {
    public  static void voiting(int age){
        if(age>=18){
            System.out.println("congragulation you are Eligible ");
        }else{
            System.out.println("OOps Sorry you are not Eligible! try for next Year");
        }
    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        int age=read.nextInt();
voiting(age);
    }
}
