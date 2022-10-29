public class BookAllocationProblem {

    //to add all elements of an array
    static int addAll(int arr[]){
        int sum = 0;
        for(int i = 0;i <arr.length ;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    //to find if a solution is possible or not
    static boolean possibleSol(int mid, int arr[],int m){
        
        int studentCnt = 1;
        int pageSum = 0;
        for(int i = 0;i<arr.length;i++){
            if(pageSum+arr[i]<=mid){
                pageSum+=arr[i];
            }
            else{
                studentCnt++;
                if(studentCnt>m|| arr[i]>mid){
                    return false;
                }
                pageSum = 0;
                pageSum =arr[i];
            }

            }
            return true;
        }
        
    

    static int bookAllocated(int n, int m, int[] arr){
        int start = 0;
        int end = addAll(arr);
        int mid = start+(end-start)/2;
        int ans = -1;
        while(start<=end){
            if (possibleSol(mid,arr,m)) {
                
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            mid = start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        //no of students = m
        //no of books = n
        int n  = 4;
        int m = 4;
        int[] arr = {5,17,100,11};

        int ans = bookAllocated(n,m,arr);
        System.out.println("The minimum value of the maximum number of pages in book allocation is " +ans);
        
        
        
    }
    
    
}
