/*input:
        Hello world
        I am a file
        Read me until end-of-file.

        output:
        1 Hello world
        2 I am a file
        3 Read me until end-of-file.*/

import java.util.Scanner;

public class ScannerEndOfFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if(s.hasNext())
        {
            for(int i=1;s.hasNext();i++)
            {
                String str= s.nextLine();
                System.out.println(i+" "+str);
            }

        }
    }
}