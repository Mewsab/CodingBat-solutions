public class deFront {
    public String deFront(String str) {
        String output = "";

        if (str.length() >= 1 && str.charAt(0) == 'a') {
            output += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            output += str.charAt(1);
        }
        if (str.length() > 2) {
            output += str.substring(2);
        }

        return output;
    }

}
