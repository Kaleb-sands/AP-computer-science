public class AlarmClock{
    private int currentHour;
    private int currentMin;
    private int currentSec;
    private int alarmHour;
    private int alarmMin;
    private int alarmSec;
    private boolean alarmOn;
    private String message;

    public void setCurrentHour(int hour){
        currentHour = hour;
    } 
    public void setCurrentMin(int min){
        currentMin = min;
    }
    public void setCurrentSec(int sec){
        currentSec = sec;
    }
    public void setAlarmHour(int targetHour){
        alarmHour = targetHour;
    }
    public void setAlarmMin(int targetMin){
        alarmMin = targetMin;
    }
    public void setAlarmSec(int targetSec){
        alarmSec = targetSec;
    }
    public void setAlarmOn(boolean on){
        alarmOn = on;
    }
    public void setMessage(String text){
        message = text;
    }

    public int getCurrentHour(){
        return currentHour;
    }
    public int getCurrentMin(){
        return currentMin;
    }
    public int getCurrentSec(){
        return currentSec;
    }
    public int getAlarmHour(){
        return alarmHour;
    }
    public int getAlarmMin(){
        return alarmMin;
    }
    public int getAlarmSec(){
        return alarmSec;
    }
    public boolean getAlarmStatus(){
        return alarmOn;
    }
    public String getMessage(){
        return message;
    }

    public void setCurrentTime(int h, int m, int s){
        currentHour = h;
        currentMin = m;
        currentSec = s;
    }
    public void clearMessage(){
        String temp = "";
        message = temp;
    }
    public void setAlarm(int h, int m, int s){
        alarmHour = h;
        alarmMin = m;
        alarmSec = s;
    }
    public void startAlarm(){
        alarmOn = true;
    }
    public void stopAlarm(){
        alarmOn = false;
    }
    public void displayCurrentTime(){
        System.out.println("The current time is " + currentHour + ":" + currentMin + ":" + currentSec);
    }
    public void displayAlarmTime(){
        System.out.println("The alarm time is " + alarmHour + ":" + alarmMin + ":" + alarmSec);
    }
    public void displayStatus(){
        if(alarmOn){
            System.out.println("The alarm is on");
        }
        else{
            System.out.println("The alarm is off");
        }
    }
}