package org.example;

public class Alien {
     Alien(){
         System.out.println("Aliens here");
     }
    private int age ;
    public Alien(int age) {
        this.age = age;
    }
    String name;
    public Alien(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Alien " + name + " is " + age);
    }

    private laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String hlo() {

        return "Working on awesome project";
    }

}
