public class Program1 {
    public static void main(String[] args) {
      print(10);  
    }
    //print nos from n to 1
    public static void print(int n){
        //base case
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}



