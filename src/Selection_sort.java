import java.util.*;
public class Selection_sort {
public static void printArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr);
    }
}
    public static void main(String[]args){
try{
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=read.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the Element in the array");
        for(int i=0;i<n;i++){
            array[i]=read.nextInt();

        }
        //Selection Sort

        for(int i=0;i<n-1;i++){
           int smallest=i;
           for(int j=i+1;j<n;j++){
               if(array[smallest]>array[j]){
                   smallest=array[j];

               }


           }


int temp=array[smallest];
           array[smallest]=array[i];
           array[i]=temp;


        }System.out.println("the Sorted Array is");
    printArray(array);

}catch(Exception e){
    System.out.println("Enter the valid input like number only");


}

    }
}
