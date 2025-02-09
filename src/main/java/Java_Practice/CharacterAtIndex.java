package Java_Practice;

public class CharacterAtIndex {
    public static void main(String[] args) {
        String t = "Java Exercises!";
        //The character at position 0 is J
        //The character at position 10 is i

        char c;

        for(int i = 0; i<t.length(); i++){
            c = t.charAt(i);
            if(c=='J' || c=='i'){
                System.out.println("The character at " + i + " position is: " + c);
            }
        }
    }
}
