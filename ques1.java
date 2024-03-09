import java.util.*;
public class ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ab = sc.next().charAt(0);
        if (ab == 'E' || ab =='e') {
            System.out.println("Early Bird Ticket");
        } else if(ab =='D' || ab == 'd'){
            System.out.println("Discount Ticket");
        }else if(ab == 'V' || ab == 'v'){
            System.out.println("VIP Ticket");
        }
        else if(ab == 'S' || ab == 's'){
            System.out.println("Standard Ticket");
        }
        else if(ab == 'C' || ab == 'c'){
            System.out.println("Children Ticket");
        }
        else{
            System.out.println("Invalid Ticket \nPlease have a new One");
        }
    }
    
}

/*
 * 
 * Problem Statement



The Magic Castle, the home of the Academy of Magical Arts in California, has organized the great "WonderWorks Magic Show". Renowned magicians were invited to mystify and thrill the crowd with their world's most spectacular magic tricks. 



The Ticket booking for the show started 2 days prior, and there were different types of tickets offered at different fares. 



The show organizers wanted to place a scanning machine at the entrance of the venue for scrutiny. The machine will take the input of a character denoting the various ticket types and display the equivalent ticket type of the given character.



There are 5 types of tickets, each of which is denoted by a character (both upper and lower case). 



Please find the equivalent strings for the characters below.

E or e - Early Bird Ticket
D or d - Discount Ticket
V or v - VIP Ticket
S or s - Standard Ticket
C or c - Children Ticket


Write a program for the scanning machine that will take the input of a character and print the equivalent string as given. 

Input format :
The input is a single character representing a ticket type.

Output format :
The output should display the equivalent ticket type for the given character.



Refer to the sample input and output for formatting specifications.

Sample test cases :
Input 1 :
E
Output 1 :
Early Bird Ticket
Input 2 :
D
Output 2 :
Discount Ticket
Input 3 :
v
Output 3 :
VIP Ticket
Input 4 :
c
Output 4 :
Children Ticket
Input 5 :
S
Output 5 :
Standard Ticket
 */