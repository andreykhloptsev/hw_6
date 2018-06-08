package ru.geekbrains.hw6;


import java.util.Scanner;

public class Main {

public static  Scanner scr= new Scanner(System.in);




    public static void main(String[] args) {
        Cat catFirst = new Cat();
        catFirst.info();
        Cat catSecond = new Cat();
        catSecond.info();
        Dog dogFirst = new Dog();
        dogFirst.info();
        System.out.println("Введите действие r - run , j - jump, s - swim");
        int dist;
        char action = scr.nextLine().charAt(0);
        switch (action){
            case 'r':
                System.out.println("Введите дистанцию бега");
                dist= scr.nextInt();
                catFirst.run(dist);
                catSecond.run(dist);
                dogFirst.run(dist);
                break;
            case 'j':
                System.out.println("Введите высоту прыжка");
                double height= scr.nextDouble();
                catFirst.jump(height);
                catSecond.jump(height);
                dogFirst.jump(height);
                break;
            case 's':
                System.out.println("Введите дистанцию для плавания");
                dist= scr.nextInt();
                catFirst.swim(dist);
                catSecond.swim(dist);
                dogFirst.swim(dist);
                break;

        }

    }
}
