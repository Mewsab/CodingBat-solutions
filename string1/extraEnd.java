public class extraEnd {
    public String extraEnd(String str) {
        if (str.length() >= 2){
            String lastTwo = str.substring(str.length()-2);

            return lastTwo + lastTwo + lastTwo;
        }
        else
            return str;
    }

}
