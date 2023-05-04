public class checkLeapyear {
    public static void main(String[] args) {
        int year = 2017;

        if(year % 4 ==0) {
            if(year % 100 == 0){
                System.out.println("Its not a Leap Year!");
            }
            else {
                 System.out.println("Its a Leap Year!");
            }
        }
        else {
            System.out.println("Its not a Leap Year!");
        }
    }
}
