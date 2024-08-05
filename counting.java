import java.util.Scanner;


public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofDigits=0;
        int original_n;
        while(n>0){
            n=n/10;
            sumofDigits++;

        System.out.println("Numberofdigitsin"+"original_n"+"="+sumofDigits);    

        }
    }

    
}
