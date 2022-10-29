
public class squareRootUsingBinarySearch {

    public static int sqrt(int a) {
        int start = 0;
        int end = a;
        int ans = -1;
        int mid = start +(end-start)/2;
        while(start<=end){
            long square = mid*mid;
            if(square == a){
                return mid;
                
            }
            else if (square<a) {
                ans=mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start +(end-start)/2;
        }
        return ans;
    }


    public static double precision(int a, int precision, int tempSol){

        double factor  = 1;
        double ans = tempSol;
    for(int i = 0;i<precision ; i++){
        factor = factor/10;
        
        for(double j = ans;j*j<a;j = j+factor){
            ans = j;
        }

    }
    return ans;
    }

    public static void main(String[] args) {
        int a = 17;
        int tempSol = sqrt(a);

        System.out.println("sqrt is "+ precision(a, 3, tempSol));

    }
}
