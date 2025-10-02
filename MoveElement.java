public class MoveElement {



    public static void moveAllX(String str, String newStr,int index,char x){
 int count=0;
 char currChar= str.charAt(index);
if (index==str.length()-1) {
 for (int i = 0; i < count; i++) {
  
    newStr +="x";
 }
    System.out.println("New String is "+ newStr );
    return;
}

if (currChar== x) {
     count++;
     moveAllX(str, newStr, index+1, x);
     
     
    }else{
    newStr+=currChar;
      moveAllX(str, newStr, index+1, x);
}
    }
    public static void main(String[] args) {
        String str = "axbcxxd";

moveAllX(str, "",0,'x');

    }
    
}
