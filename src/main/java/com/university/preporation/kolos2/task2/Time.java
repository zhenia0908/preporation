package com.university.preporation.kolos2.task2;

public class Time {
    /*Написать класс время
Поля – минута, секунда, час
Написать методы, позволяющие переместить время вперед
а)0 n сек , n < 60,
б) 0 n мин , n < 60
в) 0 n часов , n < 24
compareTo для времени
время считается в суточном цикле

Time time = new Time (16:10:13)
addNSec(int n)
int n - 178
178 = x по 60 - это количество минут, остальное секунлы

11:18
120 - сек = 2 минуты, 58 секунд
прибавить к твоему Time
13 + 58 > 60 => еще + 1 мин
*/
    private int min;
    private int sec;
    private int hour;

    public Time(int min, int sec, int hour) {
        this.min = min;
        this.sec = sec;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Time{" +
                "min=" + min +
                ", sec=" + sec +
                ", hour=" + hour +
                '}';
    }

    public Time(){}
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


}
