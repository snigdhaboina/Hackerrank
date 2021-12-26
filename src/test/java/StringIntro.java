/*Given two strings of lowercase English letters,  and , perform the following operations:

        Sum the lengths of  and .
        Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
        Capitalize the first letter in  and  and print them on a single line, separated by a space.
        Input Format

        The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

        Output Format

        There are three lines of output:
        For the first line, sum the lengths of  and .
        For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
        For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

        Sample Input 0

        hello
        java
        Sample Output 0

        9
        No
        Hello Java
        Explanation 0

        =====================================================================*/

import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i=A.compareTo(B);
        if(i>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        char a1 = Character.toUpperCase(A.charAt(0));
        String a2 = A.substring(1);
        char b1 = Character.toUpperCase(B.charAt(0));
        String b2 = B.substring(1);
        System.out.println(a1+a2+" "+b1+b2);
    }
}



