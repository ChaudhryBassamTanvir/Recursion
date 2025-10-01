public class StringInReverse {


    public static void toReverseString(String toReverse, int index){


    if (index<0) {
        return;
        
    }

    System.out.print(toReverse.charAt(index));
toReverseString(toReverse, index-1);


    }
    public static void main(String[] args) {
        
String toReverse="abcd";

int index = toReverse.length()-1;
toReverseString(toReverse,index);

    }
}
