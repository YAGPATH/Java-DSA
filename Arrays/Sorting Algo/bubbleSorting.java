
// sorting given array using bubble sort

class bubbleSorting{
    public static void main(String args[]){
        int[] arr = {1,5,2,8,9,10,25,15,29,30};

        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
                
            }
        }  
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }    
    } 
}




/* bubble sort basically starts comparing first number with second number and if first number is greater it sorts the greater number to last.
and it do same process untill and unless our array gets sorted.*/
