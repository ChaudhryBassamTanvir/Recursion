public class FirstandLastOccurance {

         public static int first=-1;
         public static int second=-1;

    public static void PrintOccurance(String str, int index, char element){


        if (index==str.length()) {
            System.out.println(first);
            System.err.println(second);
            return;

            
        }
    
    char currChar = str.charAt(index);
        if (currChar==element) {
            if (first==-1) {

                first=index;
            }else{
            second=index;
        }


            
        }
PrintOccurance(str, index+1, element);


    }

    public static void main(String[] args) {

  String str = "abaacdaefaah";


PrintOccurance(str, 0,'a');
    }
    
}
