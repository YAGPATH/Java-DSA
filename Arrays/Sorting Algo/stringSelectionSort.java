

public class stringSelectionSort {
    public static void main(String[] args) {
       
        String[] arr = {"one", "two", "three", "four", "five"};
        int min;
        String temp = "";
        for(int i = 0; i < arr.length; i++) {

             min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[min]) < 0){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
           
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
