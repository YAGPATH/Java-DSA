
public class greaterAmongThreeNumber{
    public static void main(String[] args) {
    
        int a = 1022;
        int b = 15;
        int c = 1356;

        if(a>b && a>c){
            System.out.println("a is greater than b and c");
        }
        else if (b>a & b>c){ 
            System.out.println("b is greater than a and c");
        }
        else {
            System.out.println("c is greater than a and c");
        }

    
    // or if we need to print the greater number

    if(a>b && a>c){
            System.out.println(a);
        }
        else if (b>a && b>c){  
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}