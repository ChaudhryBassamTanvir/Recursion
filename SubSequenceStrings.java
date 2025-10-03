public class SubSequenceStrings {



    public static void printSubSeq(String str,String newStr,int index){

        char currChar = str.charAt(index);
        //to be

        printSubSeq(str, newStr+currChar, index+1);

        //not to be 
printSubSeq(str, newStr, index+1);


    }
    public static void main(String[] args) {
        String str = "abc";
printSubSeq(str,"", 0);
    }
}
