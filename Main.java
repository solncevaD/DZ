package com.company;

public class Main {

    public static void main(String[] args) {
        sum();
        tabl();
        distance();
        sr();
        TwoDZ.sortMax();
        //TwoDZ.sortTWO();

    }
    public static void sum(){
        int array[]={0,1,2,3,4,5,6,7,8,9};
        int s=0;
        for (int i=0;i<array.length;i++){
            s+=array[i];
        }
        System.out.println(s);
    }

    public static void distance(){
        int arr[]={4,8,6,1,2,9,4};
        double min = Math.abs(arr[1] - arr[0]);
        int index = 0;
        for(int i = 1; i < arr.length - 1; ++i)
        {
            double tmp = Math.abs(arr[i+1] - arr[i]);
            if (min > tmp)
            {
                min = tmp;
                index = i;
            }
            System.out.println(index);
            System.out.println(min);

        }

    }

   public static void tabl(){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }
    }
   public static void sr(){
       int arr[]={23,6,47,35,2,13};
       int s=0;
       int res1s=0;
       for (int i=0;i<arr.length;i++){
           s+=arr[i];
       }
       res1s=s/arr.length;
       System.out.println("total:"+ res1s);
   }
}
