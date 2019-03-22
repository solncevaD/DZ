package com.company;

import java.util.Scanner;

public class TwoDZ {
    public static void TwoDZ(String[] args){
       sortMax();
        //sortTWO();
    }

    public static void sortMax(){

        Scanner in=new Scanner(System.in);
        System.out.print("input:" );
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int tmp;
        if (a>=c){
        tmp=a;
        a=c;
        c=tmp;
        }
        if (a>=b){
        tmp=b;
        a=b;
        b=tmp;
        }
        if (b>=c){
        tmp=b;
        b=c;
        c=tmp;
        }
        System.out.print("a=" +a);
        System.out.print("b=" +b);
        System.out.print("c=" +c);
    }
   // public static void sortTWO(){

   // }
}
