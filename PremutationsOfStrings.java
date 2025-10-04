public class PremutationsOfStrings {


public static void printPermutations(String str, String premutations){


    if (str.length()==0) {
        System.out.println(premutations);
        return;
        
    }

for (int i = 0; i < str.length(); i++) {
    char currChar = str.charAt(i);
    String newStr = str.substring(0, i) + str.substring(i+1);
    printPermutations(newStr, premutations+currChar);
}


}


    public static void main(String[] args) {
        //all possible combinations of letters



        String str= "abc";
        printPermutations(str, "");

    }
}
