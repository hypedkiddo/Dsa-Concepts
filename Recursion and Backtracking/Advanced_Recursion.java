public class Advanced_Recursion {
    public static void main(String[] args) {
        boolean map[]=new boolean[26];
        String s="apnancollege";
        String ans="";
        int i=0;
        rmdup(s, ans, i, map);


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

       // Length of a String using Recursion
    public static int len(String str, int i, int length) {
        if (i == str.length()) {
            return length;
        }
        return len(str, i + 1, length + 1);
    }

    //Remove Duplicates from  a String
    public static  void  rmdup(String s,String ans,int i,boolean[] arr){
        //base case
        if(s.length()==i){
            System.out.println(ans);
            return;
        }
        //kaam
        if(!arr[s.charAt(i)-'a']){
            ans+=s.charAt(i);
            arr[s.charAt(i)-'a']=true;
        }
        //Recursion
         rmdup(s,ans,i+1,arr);

    }
}
