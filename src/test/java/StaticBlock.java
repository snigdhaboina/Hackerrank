/*Input Format

        There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

        Constraints

        Output Format

        If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

        Sample input 1

        1
        3
        Sample output 1

        3
        Sample input 2

        -1
        2
        Sample output 2

        java.lang.Exception: Breadth and height must be positive

        ***************************
        CANT DO ANY CHANGES TO MAIN METHOD*/


import java.util.Scanner;

public class StaticBlock {

    public static boolean flag;
    static Scanner s=new Scanner(System.in);
    public static int B=s.nextInt();
    public static int H=s.nextInt();
    static
    {
        flag = true;
        try{
            if(B<=0 || H<=0)
            {
                flag= false;
                throw new Exception("Breadth and height must be positive");
            }}
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
