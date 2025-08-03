public class doubleX {
    public boolean doubleX(String str) {
        int xFirst = str.indexOf("x");

        if (xFirst == -1 || xFirst + 1 >= str.length()) {
            return false;
        }

        if (str.charAt(xFirst + 1) == 'x') {
            return true;
        }
        else {
            return false;
        }
    }
}
