package by.balvanovich.lesson5.Task1;

import java.sql.SQLOutput;

public class Time {
    int sec;
    int min;
    int hour;

    public int sec() {
        return sec + (min * 60) + (hour * 3600);
    }

    public static boolean Compare(Time x, Time y) {
        if (x.sec() > y.sec())
            return true;
        else return false;

    }

    public Time(int sec) {
        this.hour = sec / 3600;
        sec = sec % 3600;
        this.min = sec / 60;
        sec = sec % 60;
        this.sec = sec;
    }

    public Time(int hour, int min, int sec) {
        if (min >= 60 || sec >= 60) {
            return;
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void Print() {
        System.out.println(this.hour + "час(ов) - " + this.min + " минут(а) - " + this.sec + " секунд(а) - ");
    }


    public static void main(String[] args) {
        Time now = new Time(23434);
        Time tommorow = new Time(12, 43, 18);

        System.out.println(tommorow.sec());
        if (Time.Compare(now, tommorow)) {

        }
        int s = now.sec();
        now.Print();

    }
}
