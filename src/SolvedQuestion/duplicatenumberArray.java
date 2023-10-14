package SolvedQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.*;

public class duplicatenumberArray {
        public static ArrayList<Integer> duplicates(int arr[], int n) {
            // code here
            Set<Integer> hash= new HashSet<>();
            Set<Integer> hash1= new HashSet<>();

            for(Integer I:arr){
                if(hash.add(I)==false){
                    hash1.add(I);
                }
            }
            ArrayList<Integer> arr1=new ArrayList<Integer>(hash1);
            Collections.sort(arr1);
            if(arr1.size()==0){
                arr1.add(-1);
            }
            System.out.println(arr1);
            return arr1;
        }

    public static void main(String[] args) {
            int[] arr={13,9,25,1,1,0,22,12,22,20,3,8,11,25,10,3,15,11,19,20,2,4,14,23,14};
            int n=26;
            duplicates(arr,n);

    }
}
