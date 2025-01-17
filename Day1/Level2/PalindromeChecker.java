class Palindrome{
    String text;


    Palindrome(String text){
        this.text = text;
    }
 
    public boolean palindrome(){
        int left =0, right = text.length()-1;
        while(left <= right){
            if(text.charAt(left) != text.charAt(right)){
              return false;
            }
            left++;
            right--;
        }
        return true;
    }
  
     public void displayResult(){
       if(palindrome()){
        System.out.println("The text " + text  + " is palindrome.");
       } else{
        System.out.println("The text " + text  + " is not palindrome.");
       }
     }


}


public class PalindromeChecker {
    public static void main(String[] args) {
        Palindrome str = new Palindrome("12321");
        str.displayResult();
    }
}
