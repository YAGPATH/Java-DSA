public class greaterAmongTwoNumber{
    public static void main(String[] args) {
    
        int a = 1022;
        int b = 15;

        if(a<b){
            System.out.println("a is smaller than b");
        }
        else{
            System.out.println("a is greater than b");
        }
    
    // or if we need to print the greater number

    if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}