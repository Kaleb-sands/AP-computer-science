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
        alarm1.displayStatus();

        AlarmClock alarm2 = new AlarmClock();
        alarm2.setCurrentTime(4, 46, 0);
        alarm2.setAlarm(7, 30, 0);
        alarm2.stopAlarm();
        alarm2.displayCurrentTime();
        alarm2.displayAlarmTime();
        alarm1.displayStatus();

        kb.close();
    }
}