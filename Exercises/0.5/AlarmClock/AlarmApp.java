import java.util.Scanner;

public class AlarmApp{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        AlarmClock alarm1 = new AlarmClock();
        
        System.out.println("What is the current hour:");
        int h = kb.nextInt();
        System.out.println("What is the current minute:");
        int m = kb.nextInt();
        System.out.println("What is the current second:");
        int s = kb.nextInt();
        alarm1.setCurrentTime(h, m, s);
        alarm1.setAlarm(6, 15, 0);
        alarm1.startAlarm();
        alarm1.displayCurrentTime();
        alarm1.displayAlarmTime();
        System.out.println("the alarm is on: " + alarm1.getAlarmStatus());

        AlarmClock alarm2 = new AlarmClock();
        alarm2.setCurrentTime(4, 46, 0);
        alarm2.setAlarm(7, 30, 0);
        alarm2.setAlarmOn(false);
        alarm2.displayCurrentTime();
        alarm2.displayAlarmTime();
        System.out.println("the alarm is on: " + alarm2.getAlarmStatus());

        kb.close();
    }
}