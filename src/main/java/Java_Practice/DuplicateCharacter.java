package Java_Practice;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String t = "hackerearth";

        System.out.println("finding using char");
        char prevC;
        char nextC;
        for(int i = 0; i<t.length(); i++){
            prevC = t.charAt(i);
            for (int j=i+1; j<t.length(); j++){
                nextC = t.charAt(j);
                if(prevC == nextC){
                    System.out.println("Duplicate Character is: " + prevC);
                }
            }
        }
        System.out.println("\n");

        System.out.println("finding using char array");
        char[] ch = t.toCharArray();

        for(int i = 0; i<t.length(); i++){
            for (int j=i+1; j<t.length(); j++){
                if(ch[i] == ch[j]){
                    System.out.println("Duplicate Character is: " + ch[i]);
                }
            }
        }
    }
}
