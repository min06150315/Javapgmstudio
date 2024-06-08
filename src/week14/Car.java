package week14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
    int number;
    String type;
    String entryTime;
    Car(int number, String type, String entryTime) {
        this.number = number;
        this.type = type;
        this.entryTime = entryTime;
    }
    public int calculateTime(String entryTime, String exitTime) {
        try {
            SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd HHmm");
            Date entryDate = s.parse(entryTime);
            Date exitDate = s.parse(exitTime);
            int time = (int) (exitDate.getTime() - entryDate.getTime()) / (1000 * 60);
            return time;
        } catch (Exception e) {
            return 0;
        }
    }
    public int calculateFee(int time) {
        if (time < 10)
            return 0;
        else
            return (time / 10 * 500);
    }
}
