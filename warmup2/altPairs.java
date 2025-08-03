public class altPairs {
    public String altPairs(String str) {
        String str2 = "";

        for (int i=0; i<str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            str2 += str.substring(i, end);
        }
        return str2;
    }
}
