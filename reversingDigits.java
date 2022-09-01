import java.util.Scanner;

public class reversingDigits {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a no to be reversed :- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a,ans=0;
        while(n!=0){
            a = n%10;
            ans = ans*10+a;
            n=n/10;
        }
        System.out.println("Reverse digit is "+ans);
    }
}
