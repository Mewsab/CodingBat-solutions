public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && !bSmile)
        {
            return true;
        }
        else if (aSmile && bSmile) {
            return true;
        }
        else if (aSmile == false && bSmile == true){
            return false;
        }
        else{
            return false;
        }
    }
}
