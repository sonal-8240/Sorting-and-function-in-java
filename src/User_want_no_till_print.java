import java.util.*;
public class User_want_no_till_print {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
List<Integer>positives=new ArrayList<>();
List<Integer>negative=new ArrayList<>();
List <Integer>Zero=new ArrayList<>();
String choice;
do{
    System.out.println("Enter a number ");
    int num=sc.nextInt();
    //Separe the number
    if(num>0){
        positives.add(num);

    }else if(num<0){
        negative.add(num);
    }else{
        Zero.add(num);
    }
    //Ask for the user want to continue
    System.out.println("Do you want to continue ");
    choice=sc.next();

}while(choice.equalsIgnoreCase("y"));
System.out.println("positive number are " +positives)
;
System.out.println("Negative number are"+negative);
System.out.println("Zero number are "+Zero);

    }


}
