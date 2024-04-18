import java.util.Arrays;

public class Insertion {
    // Doing it the iterative way
    static void insertion (int [] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    //Doing it with recursion
    static void recursiveinsertion(int []arr,int index){
        if(index==arr.length){
            return;
            //Bhai katley
        }
        int key=arr[index];
        int j=index-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
        recursiveinsertion(arr,index+1);
    }

    public static void main(String[] args) {
    int[] arr={4,3,2,1};
    recursiveinsertion(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
