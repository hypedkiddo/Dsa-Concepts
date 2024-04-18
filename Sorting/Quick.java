import java.util.Arrays;

public class Quick {

    static void quick(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int s=low;
        int e=high;
        int mid=(low+high)/2;
        int pivot=arr[mid];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }

    public static void main(String[] args) {
        int[] arr={4,1,7,9,3};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
