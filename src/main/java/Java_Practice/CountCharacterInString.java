package Java_Practice;

public class CountCharacterInString {
    public static void main(String[] args) {
        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        char[] c = s.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int specChar = 0;


        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(c[i])){
                letter++;
            }
            else if(Character.isSpaceChar(c[i])){
                space++;
            }
            else if (Character.isDigit(c[i])){
                num++;
            }
            else{
                specChar++;
            }
        }
        System.out.println(letter);
        System.out.println(space);
        System.out.println(num);
        System.out.println(specChar);
    }
}
