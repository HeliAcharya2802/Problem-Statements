/* 
	Problem statement
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.

Example:
Input: The character is 'a'.

Output: 0

Explanation: The input character is lowercase, so our answer is 0.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
v
Sample Output 1 :
0
Explanation of Sample Input 1:
The input character is lowercase, so our answer is 0.
Sample Input 2 :
V
Sample Output 2 :
1
Explanation of Sample Input 2:
The input character is uppercase, so our answer is 1.

Solution : 
 */

import java.util.Scanner;


class Solution{
	public static void main(String args[]){

	System.out.println("Please enter the any letter input ");
	Scanner sc = new Scanner(System.in);
	char input = sc.next().charAt(0);
	System.out.println("Your input is :" + input);

	if(input >= 'A' && input <='Z'){
		System.out.println("your input character is upper case,so our answer is 1 ");

	}
	else if(input >= 'a' && input <='z'){
		System.out.println("your input character is lower case,so our answer is 0 ");
	}
	else{
		System.out.println("your input character is not alphabet,so our answer is -1 ");

	}

	}
}