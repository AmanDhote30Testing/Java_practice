package Java_Practice;

public class ExtractData {
    public static void main(String[] args) {
        String s = "Python";

        //System.out.println(s.split("h")[0]); using split method

        String word = "";
        char c;
        for(int i = 0; i<3; i++){
            c = s.charAt(i);
            word = word+c;
        }
        System.out.println(word);

    }
}
