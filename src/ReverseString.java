public class ReverseString {
    public static void main(String[] args) {
        String a="hello";
        int l=a.length();
        String rev="";
        //using Char At
//        for(int i=l-1;i>=0;i--){
//            rev=rev + a.charAt(i);
//        }
//        System.out.println(rev);

        //Using Character Array
        char j[]=a.toCharArray();
        for(int i=l-1;i>=0;i--){
            rev=rev + j[i];
        }
        System.out.println(rev);

    }
}
