package com.university.preporation.kolos2.task2;

public class TimeTester {
    //12, 4, 23
    //3903

    //Time(16:54:59)
    //n для ветки где больше 60 = 4106
    //n для ветки где меньше||= 60 = 60

    Time calculateSec(Time time, int sec) {
        Time timeResult = new Time();
        if (sec <=60) {//n=60
            int intermediateResultOfSec = sec + time.getSec(); //intermediateResultOfSec = 59 + 60 = 119 (но оно больше 60)
            if (intermediateResultOfSec > 60) {
                time.setMin(time.getMin()+1);
                time.setSec(intermediateResultOfSec-60);
                return time;
                //Time(16:55:59)
            } else {
                time.setSec(intermediateResultOfSec);
                return time;
            }
        }
        else {
            //посчитать с помомщью деления без учета остатка, сколько минут содержится в sec
            //new Time
            //посчитали сколько минут - получили в секундах(ostatokSec) Time(?:?:ostatokSec)
            //смотрим на это количество минут, есть ли там часы (больше 60 или нет)
            // если больше получаем остаток(ostatokMin) Time(?:ostatokMin:ostatokSec)
            //считаем оставшиеся часы Time - готов
            //складываем Time из параметра с тем, что сформировали, учитывая что значения могут больше 60 и будет перенос
            int minut = sec/60;
            int ostatok = sec-(minut*60);
            Time time1 = new Time();
           if(minut>=60){
               int hours= minut/60;
               int ostatokMin = minut-(hours*60);

                time1 = new Time( ostatokMin,ostatok, hours);
           }else{
               time1 = new Time(time.getHour(), minut,ostatok);
           }

           int hoursResult = time.getHour()+time1.getHour();
           int minutResult = time.getMin()+time1.getMin();
           int secResult = time.getSec()+time1.getSec();
           if(secResult>=60){
               minutResult++;
               secResult -= 60;
           }
           if(minutResult>=60){
               hoursResult++;
               minutResult -=60;
           }
           timeResult.setSec(secResult);
           timeResult.setMin(minutResult);
           timeResult.setHour(hoursResult);
        }
        return timeResult;
    }

    public static void main(String[] args) {
        TimeTester tester = new TimeTester();
        System.out.println(tester.calculateSec(new Time(54,59, 16 ),4106 ));
    }
}
