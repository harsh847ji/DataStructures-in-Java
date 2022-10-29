public class bookAllocationAns {
    static boolean isPossible(int arr[], int n, int m, int curr_min) {
        int cntStudents = 1;
        int curSum = 0;

        // iterate over all the books
        for (int i = 0; i < n; i++) {

            if (arr[i] > curr_min)
                return false;

            if (curSum + arr[i] > curr_min) {

                //Increment student count by '1'
                cntStudents++;

                /* assign current book to next student and update curSum */
                curSum = arr[i];

                /* If count of students becomes greater than given no. of students, return False*/
                if (cntStudents > m)
                    return false;
            }
            /* Else assign this book to current student and update curSum */
            else
                curSum += arr[i];
        }
        return true;
    }
    static int findPages(int arr[], int n, int m) {
        long sum = 0;

        /* If number student is more than number of books */
        if (n < m)
            return -1;

        /* Count total number of pages */
        for (int i = 0; i < n; i++)
            sum += arr[i];

        for (int numPages = 1; numPages <= sum; numPages++) {
            if (isPossible(arr, n, m, numPages)) {
                return numPages;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
            
        
            
        int arr[] = {10, 20, 30, 40};
        int m = 2; //No. of students
        int n = 4;
        System.out.println("The minimum value of the maximum number of pages in book allocation is " + findPages(arr, n, m));
         
        
        
    }
    
}
