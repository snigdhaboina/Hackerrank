import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String A, String B) {

        if(A.length()!=B.length())
            return false;

        String a= A.toLowerCase();
        String b=B.toLowerCase();

        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for(int i=0;i<a.length();i++){
            int r=0;
            char k = a.charAt(i);
            if(!map.containsKey(k)){
                for(int j=0;j<a.length();j++){
                    if(k==a.charAt(j))
                        r++;
                }map.put(k, r);

            }}        //System.out.println(map);

        java.util.Map<Character, Integer> map1 = new java.util.HashMap<>();

        for(int i=0;i<b.length();i++){
            int r=0;
            char k = b.charAt(i);
            //System.out.println(k);
            if(!map1.containsKey(k)){
                for(int j=0;j<b.length();j++){
                    if(k==b.charAt(j))
                        r++;
                }
                map1.put(k, r);

            }}//System.out.println(map1);

        if(map.equals(map1))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
