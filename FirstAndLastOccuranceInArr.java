public class FirstAndLastOccuranceInArr {
    public static int FirstOcc(int arr[],int n,int k){
        int first = 0;
        int start = 0, end = n-1;
        int mid = start+((end-start)/2);
        while(start<=end){
            if(arr[mid]==k){
                first = mid;
                end = mid-1;

                
            }
            else if(arr[mid]>k){
                end = mid-1;
            }
            else if(arr[mid]<k){
                start = mid+1;
            }
            mid = start+((end-start)/2);
        }
        
        return first;
    }
    public static int lastOcc(int arr[],int n,int k){
        int first = 0;
        int start = 0, end = n-1;
        int mid = start+((end-start)/2);
        while(start<=end){
            if(arr[mid]==k){
                first = mid;
                start = mid+1;

                
            }
            else if(arr[mid]>k){
                end = mid-1;
            }
            else if(arr[mid]<k){
                start = mid+1;
            }
            mid = start+((end-start)/2);
        }
        
        return first;
    }
     
    
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,3,3,4};
        int n = 7;
        int k = 3;
       int index =  FirstOcc(arr, n, k);
       System.out.println("first index of 3 is "+index);
       int index2 = lastOcc(arr, n, k);
       System.out.println("last index of 3 is "+index2);

    }

}
