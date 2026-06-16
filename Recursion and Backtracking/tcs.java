import java.util.*;
public class tcs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] arr=line.split("\\s+");
        ArrayList<Integer> list=new ArrayList<>();
        for(String item:arr){
            list.add(Integer.parseInt(item));
        }
        System.out.println(list);
    }
}