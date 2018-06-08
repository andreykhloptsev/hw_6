package ru.geekbrains.hw6;

import java.awt.*;
import java.util.Random;


/**
 * Created by AKhloptsev
 */
public abstract class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected double jumpLimit;
    protected final int catRunLimit=150;
    protected final double catJumpLimit=1.50;
    protected final int catSwimLimit=0;
    protected final int dogRunLimit=350;
    protected final double dogJumpLimit=0;
    protected final int dogSwimLimit=10;
    public Random random=new Random();

    public Animal() {
    }

    protected  void run(int dist) {
        System.out.println("run :"+(dist<=runLimit));
    }
    protected abstract void  swim(int dist);

    protected  void jump(double dist) {
        System.out.println("jump :"+(dist<=jumpLimit));
    }
    protected void info() {
        System.out.println("Animal Info:");
        System.out.print("Run Limit: "+runLimit+",jump Limit: ");
        System.out.printf("%.2f",jumpLimit);
        System.out.println(",swim Limit: "+swimLimit);
    }


}



class Cat extends Animal {
    protected Cat(){
        this.runLimit=catRunLimit+random.nextInt((int)(catRunLimit*0.66));
        this.jumpLimit=catJumpLimit+random.nextDouble();
        this.swimLimit=catSwimLimit;
    }
    protected void swim(int dist)
    {
        System.out.println("swim:"+(dist<=swimLimit));
        System.out.println("Sorry. Cats cant swim(");
    }
}
class Dog extends Animal {
    protected Dog(){
        this.runLimit=dogRunLimit+random.nextInt((int)(dogRunLimit*0.66));
        this.jumpLimit=dogJumpLimit+random.nextDouble();
        this.swimLimit=dogSwimLimit+random.nextInt((int)(dogSwimLimit*0.66));
    }
    protected void swim(int dist)
    {
        System.out.println("swim:"+(dist<=swimLimit));
    }
}