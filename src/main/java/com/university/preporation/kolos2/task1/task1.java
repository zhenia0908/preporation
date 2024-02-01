package com.university.preporation.kolos2.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class task1 {
    /*Написать программу, которая генерирует координаты n точек на площади (х,у) находит и выводит
-координаты всех точек
- координаты  точки самой близкой/далекой к началу и расстояние
- координаты прямоугольника, который вмещает в себя все точки
*/
    int n;
    int xMax = 12;
    int yMax = 8;
    ArrayList<Coordinate> numbers = new ArrayList<>();
HashMap<Double, Coordinate>coordinate = new HashMap<>();
    public void coordinates() {
        Random random = new Random();
        n = random.nextInt(10);
        int x = 0;
        int y = 0;
        for (int i = 0; i <= n; i++) {
            x = random.nextInt(xMax + 1);
            y = random.nextInt(yMax + 1);
            Coordinate coordinate = new Coordinate(x, y);
            numbers.add(coordinate);
        }
        for (int j = 0; j < numbers.size(); j++) {
            System.out.println("(" + numbers.get(j).getX() + ";" + numbers.get(j).getY() + ")" + "\n");
        }
    }

    public void theMostDistantClosePoint() {
        double dMax = 0;
        double dMin = 100;
        for (int i = 0; i < numbers.size(); i++) {
            double d;
            d = Math.sqrt(Math.pow((numbers.get(i).getX() - 0), 2) + Math.pow((numbers.get(i).getY() - 0), 2));
            coordinate.put(d, numbers.get(i));
        }
        for(double a: coordinate.keySet()){
            if(a>dMax){
               dMax = a;
            }
            if(a<dMin){
                dMin = a;
            }
        }
        System.out.println("The most distant points are: " +dMax + " "+"(" + coordinate.get(dMax).getX()+ ";" + coordinate.get(dMax).getY() + ")");
        System.out.println("The most closer points are: " +dMin + " "+"(" + coordinate.get(dMin).getX()+ ";" + coordinate.get(dMin).getY() + ")");
    }

    public void rectangleCoordinate(){
        int xBig = 0;
        int yBig = 0;
        int xSmall = 0;
        int ySmall = 0;
        for(int i = 0;i<numbers.size();i++){
            if(numbers.get(i).getX()>xBig){
                xBig = numbers.get(i).getX();
            }
            if(numbers.get(i).getX()<xSmall){
                xSmall = numbers.get(i).getX();
            }
            if(numbers.get(i).getY()>yBig){
                yBig = numbers.get(i).getY();
            }
            if(numbers.get(i).getY()<ySmall){
                ySmall = numbers.get(i).getY();
            }
        }
        System.out.println("The points of rectangle are: " +"(" + xSmall+ ";" + yBig + ")" +"(" + xBig+ ";" + yBig + ")" +"(" + xBig+ ";" + ySmall + ")"+"(" + xSmall+ ";" + ySmall + ")");
    }
    public static void main(String[] args) {
        task1 tester = new task1();
        tester.coordinates();
        tester.theMostDistantClosePoint();
        tester.rectangleCoordinate();
    }
}
