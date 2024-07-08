package com.animal;

import java.util.Scanner;

enum Day{
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayValue;
    Day(int dayValue){
        this.dayValue = dayValue;
    }

    public int getDayValue(){
        return this.dayValue;
    }

    public static Day fromInt(int dayValue){
        for(Day day: Day.values()){
            if(day.dayValue == dayValue ){
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid day value, it should between 1 to 7");
    }
}

class Tortoise extends WaterAnimals{
    @Override
    void swim() {
        super.swim();
        System.out.println("will swim under water\n");
    }

    void dance(){
        System.out.println("will dance under water");
    }
}

class Cow implements LandAnimal{

    @Override
    public void walk() {
        System.out.println("walk in 4 legs");
    }
}


public class Main {

    static Scanner scan = new Scanner(System.in);

    static int getInt(String prompt){
        System.out.println(prompt);
        return scan.nextInt();
    }

    public static void main(String[] args) {

        Cow mollyCow = new Cow();
        mollyCow.walk();
        WaterAnimals torto2 = new Tortoise();
        torto2.swim();
        Tortoise torto1 = new Tortoise();
        torto1.swim();
        torto1.dance();

        System.out.println("Sum = "+Calculator.add(getInt("a = "),getInt("b = ")));

        System.out.println("Hello and welcome!");

        Day day = Day.fromInt(getInt("Enter day value2 = "));

        switch(day){
            case Day.SATURDAY, Day.SUNDAY:
                System.out.println("Its holly day");
                break;
            default:
                System.out.println("Its working day");
        }
    }
}