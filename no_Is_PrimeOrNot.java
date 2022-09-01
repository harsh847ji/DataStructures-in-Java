import java.util.Scanner;

public class no_Is_PrimeOrNot {
    public static void main(String[] args) {
        int n,isprime=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i=2;i<n;i++){
            if (n%i==0){
                isprime=0;
                System.out.println("It is Not a Prime no");
                break;
            }
        }
        if (isprime==1){
            System.out.println("It is a Prime no");
        }
    }
}
