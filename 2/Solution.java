/*Problem statement
Create a class named Person with a string variable 'name' and an integer variable 'age,' such that these variables are not accessible outside the class and implement a way to initialize the variables and print the variables.

Functions: 1.setValue- that sets the variables value. 2.getValue- that prints the variables value.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
Afzal
67
Sample Output 1:
The name of the person is Afzal and the age is 67.
Sample Input 2:
Ali
30
Sample Output 2:
The name of the person is Ali and the age is 30.
Explanation of Sample Input 1:
The input name is Ali and the input age is 30 which is printed in the specified format.

Solution :  (Use Encapsulation) */

import java.util.Scanner; 
import java.util.* ;
import java.io.*; 

class Person {
    
    // Complete the class
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newValue){
        this.age = newValue;
    }

    public void setName(String newValue){
        this.name = newValue;
    }
}

class Solution {
    
    public static void main(String args[]) {
        
        // Write your code here
        Person obj = new Person();
        obj.setName("Ankush");
        obj.setAge(39);

        System.out.println("The name of the person is " + obj.getName() + " and age is " + obj.getAge());
    }
}
