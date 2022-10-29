public class MaxAndMinOfAnArray {
    static class Pair{
        int min;
        int max;
    };
    static Pair getMinMax(int arr[]){
        Pair pair = new Pair();
        
        
        if(arr.length==1){
        pair.min = arr[0];
        pair.max = arr[0];
        return pair;
        }
        if (arr[0] > arr[1]) {
            pair.max = arr[0];
            pair.min = arr[1];
        } else {
            pair.max = arr[1];
            pair.min = arr[0];
        }
        for(int i = 0;i<arr.length;i++ ){
            if(arr[i]>pair.max){
                pair.max = arr[i];
            }
            else if(arr[i]< pair.min){
                
                pair.min = arr[i];
            }
        }
        return pair;
        


    }

    public static void main(String[] args) {
        int arr[] = {2,6,0,5,8,12,45,89};
        System.out.println("Min = "+getMinMax(arr).min+" Max = "+getMinMax(arr).max);


        
    }
}
