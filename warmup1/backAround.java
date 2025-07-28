public class backAround {
    public String backAround(String str) {
        String end = str.substring(str.length()-1);
        return end + str + end;
    }

}
