import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         s = s.toUpperCase();
int left = 0;
boolean isPalindrome = true;
int right = s.length() -1;
while(left < right) {
    if(s.charAt(left) != s.charAt(right)) {
        isPalindrome = false;
        break;
    }
 
    
    left++;
    right--;
}

if(isPalindrome) {
System.out.println("It is a palindrome");
}  else {
    System.out.println("Palindrome not found");
}
    }
}