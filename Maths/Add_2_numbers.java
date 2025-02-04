public class Add_2_numbers {

    //add 2 numbers without actually dividing them
    public static int divide(int x,int y){
      //Handling the finest Edge case
        if(x==y){
            return 1;
        }
        //handling negative numbers
        boolean sign=false;
        if(x>0 && y<0) sign=true;
        if(x<0 && y>0) sign=true;

        int n=Math.abs(x);
        int d=Math.abs(y);
        int ans=0;
        while(n>=d){
            int cnt=0;
            while(n >= (d << (cnt+1))){
               ans=ans+(1<<cnt) ;
               n=n-(d*(1<<cnt));
            }
        }
        if(sign){
            return -1*ans;
        }
        return ans;

    }


    public static void main(String[] args) {

    }
}
