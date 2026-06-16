package String;

public class SubString {
    public static void main(String[] args) {
//        String s= "Jaishankar";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(3,s.length()-1));
//
//print all substring
        String s= "gopi";
        for(int i=0; i<s.length(); i++){
            for(int j= i+1; j<=s.length(); j++){
//                System.out.print(s.substring(i,j)+" ");
                String sum= s.substring(i,j);


            }
            System.out.println();
            //int sum += substring(i,j);

        }
    }
}


//substring- continious part of string
//String s= "raghav";
//        System.out.println(s);
//s= "madhav";
//        System.out.println(s);
//// s.charAt(0)='m'; -- not possible