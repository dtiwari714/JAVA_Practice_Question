package StarPattern;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       //int arr1[]={16,-1115,1,1,1};
        System.out.println("Enter the number of Number of array stored in array:");
        int arrnum= sc.nextInt();
        int arr1[]=new int[arrnum];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the digit of the Number:");
        int num=sc.nextInt();
        double p=Math.pow(10,num);
//        System.out.println(p);
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>=p/10 && arr1[i]<p && num!=1  || arr1[i]<=-(p/10) && arr1[i]>-(p) && num!=1){
                count++;
            }
            if(arr1[i]>=1 && arr1[i]<10 && num<2){
                count++;
            }
        }
        System.out.println(count);

    }
}
