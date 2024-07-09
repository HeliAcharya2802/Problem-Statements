/* Problem statement
Write a program that takes three numbers a,b, and c as input and prints the largest number amongst them.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
4 6 1
Sample Output 1 :
6
Explanation of Sample Input 1:
6 is the highest of amongst all.
Sample Input 2 :
-32 -23 -76
Sample Output 2 :
-23
Explanation of Sample Input 2:
-23 is the highest of amongst all.
Sample Input 3 :
-4 0 5
Sample Output 3 :
5
Explanation of Sample Input 2:
5 is the highest of amongst all. 
Solution :
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the integer input: ");
            int input = sc.nextInt();
            arr[i] = input;
        }

        System.out.println("Your inputs are:");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
        }

	if(arr[0] > arr[1] && arr[0] > arr[2]){
		System.out.println(arr[0] + "is largest");
	}
	else if(arr[1] > arr[0] && arr[1] > arr[2]){
		System.out.println(arr[1] + "is largest");
	}
	else{
		System.out.println(arr[2] + "is largest");
	}
    }
}