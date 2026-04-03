package org.example;

public class Alien {
     Alien(){
         System.out.println("Aliens here");
     }
     private int salary;
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

    public Alien(int age, int salary) {
        this.age = age;
        this.salary = salary;
        System.out.println("Salary " + salary + " is " + age);
    }



    private Computer computer;


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

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
