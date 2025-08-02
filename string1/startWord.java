public class startWord {
    public String startWord(String str, String word) {
        if (word.length() > str.length()){
            return "";
        }
        String str1 = str.substring(1, word.length());
        String word1 = word.substring(1);

        if (str1.equals(word1)){
            return str.substring(0, word.length());
        }
        else{
            return "";
        }
    }
}
