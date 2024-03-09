import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num<=1) {
            System.out.println("Invalid Number");
        }
        int flg;
        for (int i = 1; i <= num; i++) {
            if(i==1 || i == 0){
                continue;
            }
            flg = 1;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

/*


Problem Statement

Sarah, a Mathematics teacher, aims to engage her students in identifying prime numbers.


To accomplish this, she plans to create a JavaScript program that automatically demonstrates prime numbers up to a specified upper limit.



Can you assist Sarah in automating this task?

Input format :
The input consists of an integer that denotes the upper limit and it will be stored in the "range" variable.

Output format :
The output prints the prime number from 2 to the given upper limit.

Sample test cases :
Input 1 :
31
Output 1 :
2
3
5
7
11
13
17
19
23
29
31

*/