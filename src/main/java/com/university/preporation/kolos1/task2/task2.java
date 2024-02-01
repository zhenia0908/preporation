package com.university.preporation.kolos1.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class task2 {
    /*У вас есть текстовый файл, который содержит информацию о продажах товаров в магазине в следующем формате:
Список продаваемых товаров
 Производитель Название Количество Продажи_за_единицу Общая_стоимость
 Samsung Телефон Galaxy S20 ultra 50 450.0 22500.0
 Dell Ноутбук XPS 15 20 1500.0 30000.0
 LG Телевизор OLED 10 2000.0 20000.0
 Sony Наушники WH-1000XM4 30 300.0 9000.0
 Canon Фотоаппарат EOS R5 5 0.0 20000.0
 DeLonghi Кофеварка Magnifica 15 600.0 9000.0

Разработайте программу, которая считывает данные из указанного файла и создает новый файл, представляя доступные товары в следующем формате:
Список продаваемых товаров
№ Производитель Название Количество Продажи_за_единицу Общая_стоимость
1 Samsung Телефон Galaxy S20 ultra 50 450.0 22500.0
2 Dell Ноутбук XPS 15 20 1500.0 30000.0
3 LG Телевизор OLED 10 2000.0 20000.0
4 Sony Наушники WH-1000XM4 30 300.0 9000.0
5 Canon Фотоаппарат EOS R5 5 4000.0 20000.0
6 DeLonghi Кофеварка Magnifica 15 600.0 9000.0
(т.е., дополнен порядковым номером, столбцом "Общая_стоимость"; отсортировано по убыванию количества).


Создайте второй файл, в который записываются товары, у которых количество равно 0. Формат сохранения:
Список товаров, отсутствующих в наличии
№ Производитель Название Количество Продажи_за_единицу
1 DeLonghi Кофеварка Magnifica 0 600.0
(сортировка в алфавитном порядке по производителю и названию).*/
    public void makeFile() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/university/preporation/task2/file"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/university/preporation/task2/file1"));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/main/java/com/university/preporation/task2/file2"))) {
            String line;
            ArrayList<Product> products = new ArrayList<>();
            int index = 1;
            int index1 = 1;
            bw.write(br.readLine());
            bw.write(" \n");
            bw1.write(br.readLine());
            bw1.write(" \n");
            bw.write(String.format("%-20s%-30s%-40s%-20s%-20s%-20s%n", "№", " Производитель", " Название", "Количество ", "Продажи_за_единицу", " Общая_стоимость"));
            bw1.write(String.format("%-20s%-30s%-40s%-20s%-20s%n", "№", " Производитель", " Название", "Количество ", "Продажи_за_единицу"));
            while ((line = br.readLine()) != null) {
                String[] res = line.split("\\s+");
                Product product = new Product();
                product.setMark(res[0]);
                product.setPrice(Double.parseDouble(res[res.length - 1]));
                product.setCount(Double.parseDouble(res[res.length - 2]));
                String name = "";
                for (int i = 1; i <= res.length - 2; i++) {
                    name += res[i];
                }
                product.setName(name);
                product.setValue(product.getCount() * product.getPrice());
                products.add(product);

            }
            for (int j = 0; j < products.size(); j++) {
                if (products.get(j).getCount() == 0) {
                    bw1.write(String.format("%-20s%-30s%-40s%-20s%-20s%-20s%n", index1, products.get(j).getMark(),products.get(j).getName(), products.get(j).getCount(), products.get(j).getPrice(), products.get(j).getValue()));
                    index1++;
                } else {
                    bw.write(String.format("%-20s%-30s%-40s%-20s%-20s%-20s%n", index, products.get(j).getMark(), products.get(j).getName(), products.get(j).getCount(), products.get(j).getPrice(), products.get(j).getValue()));
                    index++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        task2 tester = new task2();
        tester.makeFile();
    }
}
