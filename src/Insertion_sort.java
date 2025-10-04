import java.util.*;



public class Insertion_sort {

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

    }

    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the size of the Element");
        int n=read.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the Element in the array");
        for(int i=0;i<n;i++){
            array[i]=read.nextInt();


        }
        //Insertion sort
        for(int i=1;i<n;i++){

            int current=array[i];
            int j=i-1;
            while(j>=0&& current<array[j]){
                array[j+1]=array[j];
                j--;

            }
           array[j+1]=current;
        }

        System.out.println("Sorted array");
        printArray(array);
    }



}
