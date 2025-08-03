public class last2 {
    public int last2(String str) {
        int count = 0;
        if (str.length() < 2){
            return 0;
        }
        String last = str.substring(str.length()-2);

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(last)) {
                count++;
            }
        }

        return count;
    }
}
