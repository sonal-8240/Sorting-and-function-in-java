import java.util.*;
public class function_01 {
    public static void myName(String name){
        System.out.println("my name is" + name);
return ;
    }


    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("enter you name ");
        String name=read.nextLine();

        myName(name);
    }


}
