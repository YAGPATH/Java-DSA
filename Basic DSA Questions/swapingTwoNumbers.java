public class swapingTwoNumbers {
    public static void main(String[] args) {
        

    // swapping by taking third variable
    
    int a = 10;
    int b = 20;
    int temp;
    temp = a;
    a = b;

    System.out.println("a = " + a);
    System.out.println("b = " + b);


    // swapping without taking third variable

    int i = 10, n = 20;
    
    i = n + i;
    n = i - n;
    i = i - n;

    System.out.println("i = " + i);
    System.out.println("n = " + n);

    }
}
