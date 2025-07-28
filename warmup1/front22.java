public class front22 {
    public String front22(String str) {
        int change = 2;
        if (change > str.length()){
            change = str.length();
        }

        String front = str.substring(0 , change);
        return front + str + front;
    }

}
