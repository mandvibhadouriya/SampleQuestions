import java.util.Scanner;

public class sumOfEvenOdds {
    public static void main(String[] args) {
		System.out.println("run please");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int sumOfEvens = 0;
        int sumOfOdds = 0;
		while (n>=0){	
			int rem = n % 10;
            if (rem % 2==0) {
                sumOfEvens += rem;
            }else{
                sumOfOdds += rem;
            }
            n /= 10;
		}
        System.out.println(sumOfEvens);
        System.out.println(sumOfOdds);
        input.close();

	}
}