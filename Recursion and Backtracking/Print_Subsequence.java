import java.util.*;
public class Print_Subsequence {
    //function to print subsequence of the array,Note subsequence is not subsets
    public static void sub(ArrayList<Integer> al, int arr[], int i){
        if(i == arr.length){
            System.out.println(al.toString());
            return;
        }
        al.add(arr[i]);
        sub(al,arr,i+1);
        al.remove(al.size()-1);
        sub(al,arr,i+1);
    }

    public static int subset(ArrayList<Integer> al, int arr[], int i,int k,int sum){
        if(sum==k){
            System.out.println(al.toString());
            return 1;
        }
        if(i == arr.length){
            return 0;
        }
        sum=sum+arr[i];
        al.add(arr[i]);
        int ans1=subset(al,arr,i+1,k,sum);
        al.remove(al.size()-1);
        sum=sum-arr[i];
        int ans2= subset(al,arr,i+1,k,sum);
        return ans1+ans2;
    }



    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8 };
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(  subset(list,arr,0,10,0));
    }
}
