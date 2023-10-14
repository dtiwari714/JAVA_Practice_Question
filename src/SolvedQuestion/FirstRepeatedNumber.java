package SolvedQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedNumber {
    public static void main(String[] args) {
        int n=7;
        int[] arr={4,8,8,5,3,5,5,8};
        firstRepeated(arr,n);
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Set<Integer> sc=new HashSet<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int count=0;
        for(Integer i:arr){
            if(sc.add(i)==false){
                arr1.add(i);
            }
        };
        int temp=0;
        for(int j=0;j<arr1.size();j++){
            for (int k = j+1; k < arr1.size(); k++) {
                if(arr1.get(j)==arr1.get(k)){
                    count++;
                }
            };
            arr2.add(count);
        }
        temp=arr2.get(0);
        System.out.println(temp+1);
        return temp;

    }
}
