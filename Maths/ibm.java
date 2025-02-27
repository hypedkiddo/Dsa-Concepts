public class ibm {
    public static void setcol(int[][] arr ,int col){
        for(int j=0;j<arr.length;j++) {
            arr[j][col] = -1;
        }
    }

    public static void setrow(int[][] arr,int row){
            for(int j=0;j<arr[row].length;j++) {
                arr[row][j] = -1;
            }
    }
     public static void setmat(int[][] arr){
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 if(arr[i][j]==0){
                     setrow(arr,i);
                     setcol(arr,j);
                 }
             }

         }
     }

    public static void setzero(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }

        }
    }
    public static void printmat(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //set matrix zeroes and print the array
        int[][] arr = {
                {1, 2, 0, 4},
                {5, 0, 7, 8},
                {9, 10, 0, 12}
        };
        setmat(arr);
        setzero(arr);
        printmat(arr);
    }
}
