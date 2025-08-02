public class minCat {
    public String minCat(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        if (lengthA > lengthB){
            a= a.substring(lengthA - lengthB);
        }
        else if(lengthB > lengthA){
            b= b.substring(lengthB - lengthA);
        }
        return a+b;
    }

}
