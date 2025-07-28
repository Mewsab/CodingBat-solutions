public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() < 3){
            return false;
        }

        String nxtTwo = str.substring(1,3);

        if (nxtTwo.equals("ix")){
            return true;
        }
        else
            return false;
    }

}
