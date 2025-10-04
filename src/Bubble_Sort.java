import java.util.*;

public class Bubble_Sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }


    }

    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the Array Element ");
        int array[]=new int[5];
        for(int i=0;i<5;i++){
            array[i]=read.nextInt();
        }

    System.out.println(array);
        //bubble sort
        for(int i=0;i<array.length-1;i++){
for(int j=0;j<array.length-i-1;j++){
    if(array[j]>array[j+1])
    {//swap


        int temp=array[j];
        array[j]=array[j+1];
        array[j+1]=temp;


    }

}

            System.out.println("Sorted array is");
            printArray(array);
        }



    }



}
