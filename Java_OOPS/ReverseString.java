public class ReverseString {
    public static void main(String[] args) {
        String str = "Faraz Ashraf";

        String name="";
        String reverse= "";
        int startingIndex= str.length()-1;
        int i;
        for(i=str.length()-1;i>=0; i--){
            if(str.charAt(i)==' '){
                int endIndex= i+1;
                    for(int j=endIndex; j<=startingIndex; j++)
                    {
                        reverse+=str.charAt(j);
                    }
                    startingIndex=i-1;
            }
        }
        name+=reverse+" ";


                int endIndex= i+1;
                for(int j=endIndex; j<=startingIndex; j++)
                {
                    name+=str.charAt(j);
                }

//                startingIndex=i-1;


        System.out.println(name);
    }
}
