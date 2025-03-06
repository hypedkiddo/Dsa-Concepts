public class GridWays {

    public static int countWays(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0; //No ways possible
        }
        //Go down
        int ans1=countWays(i+1,j,n,m);
        //go right
        int ans2=countWays(i,j+1,n,m);
        //then return total ways as answers
        return ans1+ans2;
    }

    public static void main(String[] args) {
        int n=100,m=100;
        int ans=countWays(0,0,n,m);
        System.out.println(ans);
    }
}
