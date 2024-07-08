/*Problem statement
Take the length(L) and breadth(B) of the rectangle as input and find its area.

Note:
Length and breadth must be an integer value and the area will always be in the range of integers.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= L, B <= 10ˆ2
Sample Input 1:
4 20
Sample Output 1:
80
Explanation of Sample Input 1:
Length of the rectangle is 4 and breadth is 20. 
Hence the area of the rectangle is (length*breadth). 
So the answer is 4*20=80.*/

import java.util.Scanner; 
class area{
	public int area(int length,int breadth){
		int result = length*breadth;
		return result;

	}

}
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in integers");
		int length1 = sc.nextInt();
		System.out.println("Enter breadth in integers");
		int breadth1 = sc.nextInt();

		area obj = new area();
		int result = obj.area(length1,breadth1);
		System.out.println("area of the rectangle with " + "length" + length1 + "and breadth"+ breadth1 + "is :"+ result);
	}
}