package com.company;

public class Hero {

    public static int herosCount = 0;
    private String name = "Hero";
    private String sex = "male";
    private byte healthPoints = 100;
    private byte powerPoints = 10;

    public Hero() {
        System.out.println("Przed wywołaniem konstruktora " + herosCount);
        herosCount++;
        System.out.println("Po wywołaniem konstruktora " + herosCount);

    }

    public void printInfo() {
        System.out.println("Hero's characteristics\n" + "Name: " + name
                + "\nSex: " + sex + "\nHealth points: "
                + healthPoints + "\nPower points: " + powerPoints);
    }

    public void setName(String name) {
        this.name = name;
    }


    }
