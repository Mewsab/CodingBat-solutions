public class stringE {
    public boolean stringE(String str) {
        int num = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') num++;
        }

        return (num >= 1 && num <= 3);
    }


}
