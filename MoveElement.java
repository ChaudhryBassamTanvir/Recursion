public class MoveElement {



    public static void moveAllX(String str, String newStr,int index,char x,int count){
        if (index==str.length()) {
 for (int i = 0; i < count; i++) {
  
    newStr +="x";
 }
    System.out.println("New String is "+ newStr );
    return;
}

 char currChar= str.charAt(index);


if (currChar== x) {
     count++;
     moveAllX(str, newStr, index+1, x,count);
     
     
    }else{
    newStr+=currChar;
      moveAllX(str, newStr, index+1, x,count);
}
    }
    public static void main(String[] args) {
        String str = "axbcxxd";

moveAllX(str, "",0,'x',0);

    }
    
}
