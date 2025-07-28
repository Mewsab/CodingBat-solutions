public class startHi {
    public boolean startHi(String str) {

        if (str.length() < 2){
            return false;
        }

        String startTwo = str.substring(0, 2);

        if (startTwo.equals("Hi"))
        {
            return true;
        }
        else if (startTwo.equals("hi")){
            return true;
        }
        else{
            return false;
        }

    }

}

