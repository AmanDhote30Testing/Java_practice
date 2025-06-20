package Java_Practice;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Hello";
        String reverseWord = "";
        String reverseWord2 = "";
        StringBuilder reversedWord1 = new StringBuilder(); //with String Builder;
        for(int i = word.length() -1; i>=0; i-- ){
            reversedWord1.append(word.charAt(i));
        }
        System.out.println(reversedWord1);

        for(int i = word.length() -1; i>=0; i-- ){
           reverseWord += word.charAt(i); //for string operation.
        }

        char c;
        for(int i =0; i<word.length(); i++){
            c = word.charAt(i);
            reverseWord2 = c + reverseWord2;
        }
        System.out.println(reverseWord2);
    }
}
