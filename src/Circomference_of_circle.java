import java.util.*;

public class Circomference_of_circle {

    public static double circle_cercomference(int r){
        double cercumference=2*3.14*r;

        return cercumference;

    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        int radius=read.nextInt();
        System.out.println("circomference of the circle is" + circle_cercomference(radius));
    }
}
