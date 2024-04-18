import java.util.Arrays;

public class Selection {
   //Iterative approach with updating max  element at the last
    static  void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int maxel=findmax(arr,0,last);
            int temp=arr[last];
            arr[last]=arr[maxel];
            arr[maxel]=temp;
        }
    }
    private static int findmax(int[] arr, int start, int last) {
        int max=0;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    //Iterative approach with updating min  element at the first
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    //Doing  it with recursiom
    static void recursiveselection(int[] arr,int start,int end,int max){
        if(end==0){
            return;
        }

        while(start<=end){
            if(arr[start]>=arr[max]){
               max=start;
            }
            start++;
        }
        int temp=arr[max];
        arr[max]=arr[end];
        arr[end]=temp;

        recursiveselection(arr, 0, end-1,0);
    }


    public static void main(String[] args) {
    int[] arr={90,65,70,2,3,4};
    recursiveselection(arr,0,arr.length-1,0);

        System.out.println(Arrays.toString(arr));

    }
}
