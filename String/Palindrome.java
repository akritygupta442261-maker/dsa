package String;

public class Palindrome {
    public static void main(String[] args) {
        String  str= "madams";
        boolean isPalindrome= true;
        int i=0;
        int j= str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j)){
                isPalindrome= false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("palindrome");

        }else{
            System.out.println("Not a palindrome");
        }

    }
}
