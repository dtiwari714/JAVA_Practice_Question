package RecursionPracticeProblem;

public class GraterNumberInArray {
    public static void maxNumber(int[] arr, int start, int end, int max){
        if(end==start){
            System.out.println(max);
            return;
        }
        if(arr[start]>max){
            max=arr[start];
        }
        maxNumber(arr,start+1,end,max);
    }
    public static void main(String[] args) {
        int[] arr ={10,50,30,40};
        int start=0;
        int l= arr.length-1;
        int max=arr[start];
        maxNumber(arr,start,l,max);
    }
}
