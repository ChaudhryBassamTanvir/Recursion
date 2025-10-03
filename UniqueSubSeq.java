import java.util.HashSet;

public class UniqueSubSeq {
     public static void printUniqueSubSeq(String str,String newStr,int index, HashSet<String> set){
        if (index==str.length()) {
            if (set.contains(newStr)) {
                return;
                
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }

            
        }
        //abc 
        char currChar = str.charAt(index);
        //to be

        printUniqueSubSeq(str, newStr+currChar, index+1, set);

        //not to be 
printUniqueSubSeq(str, newStr, index+1,set);


    }
    public static void main(String[] args) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        printUniqueSubSeq(str, "", 0,set);
        
    }
    
}
