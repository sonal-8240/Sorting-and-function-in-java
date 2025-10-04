import java.util.*;
public class Bubble_sort1 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);

        System.out.println("Enter the array size");
        int n=read.nextInt();
        System.out.println("Enter the Element");
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=read.nextInt();
        }

        //bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }

            }


        }

        System.out.println("The sorted array is");
        printArray(array);


    }


}
