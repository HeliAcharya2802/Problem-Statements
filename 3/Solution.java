/*Problem statement
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

Note: Return answer as Floor integer value.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2000
2.2
4
Sample Output 1:
176
Explanation of Sample Input 1:
The input is principal=2000, rate=2.2 and time=4.
So Simple interest=Principal*rate*time/100 hence 
answer is 2000*2.2*4/100=176


Solution :*/ 

import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        int pri_amt = sc.nextInt();
 
        System.out.println("Enter rate of interest:");
        double rate_int = sc.nextDouble();

        System.out.println("Enter time period in years:");
        int time_taken = sc.nextInt();

        double result = (pri_amt * rate_int * time_taken) / 100;

        int floor_result = (int) Math.floor(result);

        System.out.println(floor_result);
    }
}
