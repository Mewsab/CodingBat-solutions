public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        String time = "";
        if (vacation){
            if (day >=1 && day <=5){
                time = "10:00";
            }
            else{
                time = "off";
            }
        }
        if (!vacation){
            if (day >=1 && day <=5){
                time = "7:00";
            }
            else if (day == 0 || day ==6){
                time = "10:00";
            }

        }
        return time;
    }

}
