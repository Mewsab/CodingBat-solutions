public class stringX {
    public String stringX(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                str2 += str.substring(i, i + 1);
            }
        }
        return str2;
    }
}
