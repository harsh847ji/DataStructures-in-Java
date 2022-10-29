public class SelectionSort {

    static void sort(int arr[]){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                
                }
            }
            
        }
    }




    static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        int arr[] = {1,5,0,4,9,6};

        sort(arr);

        print(arr);
        
        
    }
   
}