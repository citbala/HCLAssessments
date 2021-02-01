public class ArrayRotate{
     
     private static void print(int arr[]){
         for(int i =0; i < arr.length; i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
     
     static void rotate(int arr[], int k){
        int temp_arr[] = new int[k-1];
        for(int i =0; i <temp_arr.length;i++){
            temp_arr[i]= arr[i];
        }
        
        int start = k-1;int i = 0, j = 0;
        for(i = 0; start < arr.length; i++){
            arr[i] = arr[start];
            start++;
        }
        
        for(; i < arr.length; i++){
            arr[i]= temp_arr[j];
            j++;
        }
        
     }
     
     public static void main(String []args){
        int arr[]={1,2,7,8,9};
        int k=3;
        
        k=k%arr.length;
        rotate(arr,k);
        print(arr);
     }
}