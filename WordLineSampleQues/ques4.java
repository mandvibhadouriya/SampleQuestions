package WordLineSampleQues;
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String words[] = sentence.split(" ");
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> repeatedArrayList = new ArrayList<String>();
        for (String wordString : words) {
            if (al.contains(wordString)) {
                repeatedArrayList.add(wordString);
            }
            al.add(wordString);
        }
        // System.out.println(al);
        // System.out.println(repeatedArrayList);
        for(String repWord : repeatedArrayList){
            System.out.println(repWord);
        }
        if (repeatedArrayList.isEmpty()) {
            System.out.println("No repeated words");
        }
    }
}
/*
 * 
 * Problem Statement
You are building a text analysis tool that helps users identify the most frequently repeated words in a given input text. As part of the application, you want to provide a feature where users can enter a sentence or paragraph, and the program will output the words that are repeated more than once. The users can input multiple sentences as well.
Write a program that takes a sentence as input and prints the words that are repeated more than once.
Note: Words are case-sensitive
Input format :
The input consists of a string.
Output format :
The output displays the repeated words in the given string.
If there are no such words, print "No repeated words".
Refer to the sample input and output for formatting specifications.
Sample test cases :
Input 1 : The apple does not fall far from the tree
Output 1 : No repeated words
Input 2 : A friend in need is a friend indeed
Output 2 : friend
Input 3 : The sunlit meadow danced with wildflowers, their petals swaying gently in the warm breeze as birds sang melodiously in the treetops
Output 3 : in
           the
 */