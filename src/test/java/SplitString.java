import java.io.*;
import java.util.*;

public class SplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        scan.close();
        if(s1.trim().isEmpty())
        {
            System.out.println(0);
        }
        else
        {
            String[] str= s1.trim().split("[\\s+!,?._'@]+");
            System.out.println(str.length);
            for(int i=0;i<str.length;i++)
                System.out.println(str[i]);
        }
    }

}

