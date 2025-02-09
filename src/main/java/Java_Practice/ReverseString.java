package Java_Practice;

public class ReverseString {
    public static void main(String[] args) {
        String word = "The quick brown fox";
        String reverseWord = "";
        //StringBuilder reversedWord = new StringBuilder(); with String Builder;
        //for(int i = word.length() -1; i>=0; i-- ){
        //reverseWord.append(word.charAt(i)); for string builder.
//           reverseWord += word.charAt(i); for string operation.
//        }
        char c;
        for(int i =0; i<word.length(); i++){
            c = word.charAt(i);
            reverseWord = c + reverseWord;
        }
        System.out.println(reverseWord);
    }
}
