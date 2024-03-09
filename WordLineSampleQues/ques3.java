package WordLineSampleQues;
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        char arr[] = s1.toCharArray();
        int countChar = 0;
        System.out.print("Characters: ");
        for (char c : arr) {
            if ((c >= 65 && c<=90) || (c >=97 && c<=122)) {
                countChar++;
                System.out.print(c+" ");
            }
        }
        System.out.print("(Count: " + countChar+")\n");
        int countNums = 0;
        System.out.print("Numbers: ");
        for (char c : arr) {
            if(c >= 48 && c<=57) {
                countNums++;
                System.out.print(c+" ");
            }
        }
        System.out.print("(Count: " + countNums+")\n");
        int countSpecials = 0;
        System.out.print("Special symbols: ");
        for (char c : arr) {
            if ((c >= 33 && c<=47) || (c >=58 && c<=64)) {
                countSpecials++;
                System.out.print(c+" ");
            }
        }
        System.out.print("(Count: " + countSpecials+")\n");
        
    }
}

/*

Problem Statement



Write a program to read the user's input as a string and it will check each character in the string is a letter, number, or special symbol. 
Finally, the program prints the characters, numbers, and special symbols separately and prints the number of characters, numbers, and special symbols.

Input format :
The input is a string containing a combination of numbers, characters, and special symbols.

Output format :
The first line of output displays the characters found in the input string along with the count.
The second line of output displays the numbers found in the input string along with the count.
The third line of output displays the special symbols found in the input string along with the count.

Refer to the sample output for formatting specifications.

Sample test cases :
Input 1 :   Iamneo@123#
Output 1 :  Characters: I a m n e o (count: 6)
            Numbers: 1 2 3 (count: 3)
            Special symbols: @ # (count: 2)
Input 2 :   Iamneo@CBE
Output 2 :  Characters: I a m n e o C B E (count: 9)
            Numbers:  (count: 0)
            Special symbols: @ (count: 1)
Input 3 :   1234
Output 3 :  Characters:  (count: 0)
            Numbers: 1 2 3 4 (count: 4)
            Special symbols:  (count: 0)

*/