import java.util.Arrays;

public class Bubble {
    static  void bubble(int[] arr,int start,int end){
        //if dont understand watch triangle 1 question from bubble sort
        if(start==0){
            return;
        }
        if(start>end){
            if(arr[end]>arr[end+1]){
                int temp=arr[end+1];
                arr[end+1]=arr[end];
                arr[end]=temp;
            }
            bubble(arr,start,end+1);
        }else{
            bubble(arr,start-1,0);;
        }

    }

    static void bubblesort(int[] arr,int start,int end){
        if(end==0){
            return;
        }
        while(start<end){
            if(arr[start]>arr[start+1]){
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            start++;
        }
        bubblesort(arr, 0, --end);
    }

    static void iterativebubble(int[] arr){
        int n=arr.length;
        boolean swapped=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = false;
                }
            }
            if(swapped) {//This is to Reduce the time overhead a little bit
                break;
            }
        }
    }


    public static void main(String[] args) {
//        getting bubble sort using recursion as well as iterative approach
    int[] arr={4,3,2,1};
        bubblesort(arr,0, arr.length-1);
//        iterativebubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
