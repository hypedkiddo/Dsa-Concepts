import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
//      int[] arr=new int[5];
//      backtrack(arr,0,0);
//      System.out.println(Arrays.toString(arr));
        permute("abc","");
    }

    //Performing simple bactracking operations on array
    public static void backtrack(int[] arr,int idx,int value) {
        if (idx == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[idx] = value + 1;
        backtrack(arr,idx+1,value+1);
        //while backtracking
        arr[idx]=arr[idx]-2;
    }
    //Given a String find all permutations of that string
    //Logic is here we are trying with all the possible permutations we can have as posssible
    public static void permute(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            permute(newstr,ans+curr);
        }
    }
}
