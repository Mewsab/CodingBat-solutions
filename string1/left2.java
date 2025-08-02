public class left2 {
    public String left2(String str){
        if (str.length()<2){
            return str;
        }
        String rotate = str.substring(0, 2);
        String last2 = str.substring(2);
        return last2 + rotate;
    }

}
