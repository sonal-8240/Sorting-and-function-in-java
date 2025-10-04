import java.util.*;
public class practice {
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        List<Integer>po=new ArrayList<>();
        List<Integer>ne=new ArrayList<>();
        String choice;
        do{
            System.out.println("Enter the number");
            int num=read.nextInt();
            if(num>0){
                po.add(num);
            }else{
                ne.add(num);

            }
            System.out.println("Do you want to continue");
            choice=read.next();
        }while(choice.equalsIgnoreCase("y"));
System.out.println("positive number are"+po);
System.out.println("negative number is "+ne);


    }
}
