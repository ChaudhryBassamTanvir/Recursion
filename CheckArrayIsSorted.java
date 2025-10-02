public class CheckArrayIsSorted {


public static boolean checkSorted(int arr[],int index){

if (index==arr.length-1) {
    return true;
    
}


if (arr[index]<arr[index+1]) {
    return checkSorted(arr, index+1);
    
    
}else{
    return false;
}


}


    public static void main(String[] args) {
        int arr[]={1,2,12,4,4};

       System.out.println( checkSorted(arr,0));;
    }
}
