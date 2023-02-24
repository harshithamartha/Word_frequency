package pack3;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        for (String s2 : s1) {
            if(hm.containsKey(s2)){
                hm.put(s2,hm.get(s2)+1);


                }
            else{
                hm.put(s2,1);

            }
        }
        System.out.println(hm);
    }
}