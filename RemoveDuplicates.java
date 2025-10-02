public class RemoveDuplicates {

public static boolean[] map = new boolean[26];


public static void removeDuplicate( String str, int index,String newString){
if (index==str.length()) {
    System.out.println(newString);
    return;
}

char currChar = str.charAt(index);

if (map[currChar-'a']) {
    removeDuplicate(str, index+1, newString);

    
}else{
    newString+= currChar;
    map [currChar- 'a']=true; //mark a as seen mean mark as true
    removeDuplicate(str, index+1, newString);

}

}

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0, "");
    }
}
