public class Bs {
    static int bs(int[] arr,int low,int high,int target){
        int mid=(low+high)/2;
        //base condition
        if(arr[mid]==target){
            return mid;
        }
        if(low>high){
            return -1;//Base condition to if target not exists in the array
        }
        if(arr[mid]>target){
           return bs(arr,low,mid-1,target);
        }

          return  bs(arr,mid+1,high,target);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int ans=bs(arr,0, arr.length-1,10 );
        System.out.println(ans);
    }
}
