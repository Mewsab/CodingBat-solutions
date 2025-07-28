public class endUp {
    public String endUp(String str) {
        if (str.length() <= 3){
            return str.toUpperCase();
        }
        int last = str.length() - 3;
        String front = str.substring(0, last);
        String back  = str.substring(last);

        return front + back.toUpperCase();
    }
}
