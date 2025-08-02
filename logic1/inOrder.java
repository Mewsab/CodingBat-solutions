public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b>a && c>b){
            return true;
        }
        else if(bOk && c>b){
            return true;
        }
        else
            return false;
    }

}
