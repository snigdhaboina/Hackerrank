/*Input Format

        The first line contains a string denoting .
        The second line contains an integer denoting .

        Constraints

        consists of English alphabetic letters only (i.e., [a-zA-Z]).
        Output Format

        Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

        Sample Input 0

        welcometojava
        3
        Sample Output 0

        ava
        wel

        =====================================*/

import java.util.Scanner;

public class StringSorting {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int j=k;
        String[] words= new String[s.length()-j+1];

        for(int i=0;i<s.length()-j+1;i++)
        {
            words[i] = s.substring(i,k);
            //System.out.println(words[i]);
            k++;
        }

        for(int i = 0; i < s.length()-j; ++i) {
            for (int l = i + 1; l < s.length()-j+1; ++l) {
                if (words[i].compareTo(words[l]) > 0) {
                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[l];
                    words[l] = temp;

                }}}
        smallest=words[0];
        largest=words[s.length()-j];
        //System.out.println(smallest + "\n" + largest);

        return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
