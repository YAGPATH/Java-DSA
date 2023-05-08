
// printing string ==> Vikas in reverseal order

public class StringReverse {
public static void main(String[] args) {
    String name = "Vikas";
    int n = name.length();
    String ans = "";

        for(int i = n-1; i>=0;i--){
            ans = ans + name.charAt(i);
        }
        System.out.println(ans);
  }
} 

/*
 fir we have taken string value on line no 6.
 then we declared the length of that string using length() method;
 we have taken an empty string on line 8 to save our reverse string ahead

 now at line 10 we ran a loop starting from last index of string. To get last index we have declared length-1 because counting starts from 0 and our string is of 5 length 
 but counting for index starts from 0. so our last value will be -1 itself.

 now at line 11 we stored our reversed sting suing char at method. 
 we used name.charAt(i) because our sting is stored in name and our reverse string is comming from loo of i. so it will give reverse string.
 to store it we used ans string that we declared above in line 8.


 now to get our answer we will print outside the loop because if iwe print inside the loop we will be getting value at every point of time the loop is running.
 */