package B3_Array_Method_JAVA.thuchanh;

public class MinintheArraymethod {
    public static int minValue(int[] array){
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min+index);
    }
}

