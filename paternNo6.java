public class paternNo6 {
    public static void main(String[] args) {
        int n = 7,j=1;
        for (int i = 1 ;i <= n;i++){
            int count = 1;
            for (;count<=i;j++){
                System.out.print(j+" ");
                count++;
            }
            System.out.println();
        }
    }
}
