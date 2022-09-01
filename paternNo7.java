public class paternNo7 {
    public static void main(String[] args) {
        int n=4;
        for (int row = 1 ;row<=n;row++){
            int value = row;
            for (int col=1;col<=row; col++,value++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
