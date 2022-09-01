public class patternNo4 {
    public static void main(String[] args) {
        int n = 4,j=1;
        for (int i=1;i<=n;i++){
            for (;j<=i*n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
