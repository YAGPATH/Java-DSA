public class factorial {
    public static void main(String[] args) {
        int a = 6; int factorial = 1;

        for(int i = 1; i <= a; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);


        //using reversal loop

        int b = 5, fact = 1;
        for(int i = b; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
