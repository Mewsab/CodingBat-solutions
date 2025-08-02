public class extraFront {
    public String extraFront(String str) {
        String first2;
        if(str.length() < 2){
            first2 = str;
            return first2+ first2+ first2;
        }
        else{
            first2 = str.substring(0,2);
        }

        return first2+ first2+ first2;
    }

}
