public class array3 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{1,2,3,4}};
        int totalCount=0;

       for(int i = 0;i<arr.length;i++){
        totalCount=totalCount+arr[i].length;
       }
      System.out.println(totalCount);
      int[] arraynew= new int[totalCount];
      int k =0;
      for(int i =0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            arraynew[k] = arr[i][j];
            k++;
        }
    }
    for(int s=0;s< arraynew.length;s++){
        System.out.println(arraynew[s]);
    }

      }
    }
    
    

    





    






                 
