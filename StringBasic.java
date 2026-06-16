package String;
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        String s= sc.nextLine();
        String str= "akrity is a sucessfull women";
//        System.out.println(s);
        //length
        System.out.println(str.charAt(7));
        System.out.println(str.indexOf('r'));
        System.out.println(str.lastIndexOf('r'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        if(str.contains("akrity"))
            System.out.println("happy");





    }
}
