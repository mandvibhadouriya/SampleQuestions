import java.util.Scanner;
import java.util.*;
public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
        int tmp = n;
		while(tmp>0){
			a++;
			tmp/=10;
		}
        tmp = n;
        int sum = 0;
        while (tmp>0){
            int rem = tmp % 10;
            sum += Math.pow(rem,a);
            tmp/=10;
        }
        if (sum == n) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
