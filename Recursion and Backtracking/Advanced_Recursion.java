public class Advanced_Recursion {
    public static void main(String[] args) {
        System.out.println(TP(10));
    }
    
    //Tilling Problem (Amazon) 
        //Given a "2*n" floor and tiles of size "2*1" count the no of ways to tile the given floor using the 2*1 tiles
        //(A tile can either be placed horizontally or vertically)
    public static int TP(int n){
        if(n==0 || n==1){
            return 1;
        }
        int n1=TP(n-1);
        int n2=TP(n-2);
        return n1+n2;
    }
}
