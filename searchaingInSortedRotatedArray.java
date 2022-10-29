public class searchaingInSortedRotatedArray {
    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start+((end-start)/2);

        while(start<end){
            if (arr[mid]>=arr[0]) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start+((end-start)/2);
        }
        return start;//return end bhi likh sakte hain
    }

    public static int binarySearch(int[] arr,int key,int start,int end){

        int mid = (start/2)+(end/2);
        
        while (start<=end){
            if (arr[mid] == key){
                return mid;
            }
            else if (arr[mid]>key){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            mid = (start/2)+(end/2);
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {7,8,9,10,1,2,3,4};
        int k = 2;
        int pivotp = pivot(arr);
        if(k>=arr[pivotp]&&k<=arr[arr.length-1]){
            int ans = binarySearch(arr, k,pivotp,arr.length-1);
            System.out.println(ans);
        } 
        else{
            System.out.println(binarySearch(arr, k,0,pivotp-1)); 
        }
        

    }
    
}
