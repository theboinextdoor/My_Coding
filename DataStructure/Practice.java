public class Practice {
    public static String reverse(String word){
        if(word.length()<= 1){
            return word;
        }
        String ans = reverse(word.substring(1))+word.charAt(0);
        return ans ;

    }
    public static void main(String[] args) {
        String word = "aziza";
        System.out.println("Given Word: "+ word);
       String ans =  reverse(word);
        System.out.println("Reverse Word: "+ ans);

       if(ans.equals(word)){
           System.out.println("True");
       } else{
           System.out.println("False");
       }
    }
}
