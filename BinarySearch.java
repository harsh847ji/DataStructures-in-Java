public class BinarySearch {
    public static void main(String[] args) {
        int find = 2;
        int [] arr = {1,2,3,4};
        int start = 0;
        int end = arr.length-1;
        int mid = (end+start)/2;
        while (start<=end){
            if (arr[mid] == find){
                System.out.println(mid);
                return;
            }
            else if (arr[mid]>find){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            mid = (start/2)+(end/2);
        }
        System.out.println("Not found!");
    }
}
