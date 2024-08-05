import java.util.Scanner;
public class two_variables{

    public  int sum(int a, int b ){
        int ans = a+b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        two_variables tv=new two_variables();

      int ans_1 =  tv.sum(a,b);
      System.out.println(ans_1);
    }
    
      
}
  