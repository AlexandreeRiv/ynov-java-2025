package fr.ynov.java.medium;

enum Nationality {
    France, Germany , American , Canadian, Russian
}

public class Person {
    //attributes of person
    private String name;
    private int age;
    private String gender;
    private int height;
    private int weight;
    Nationality nationality;

//Constructor
    Person(String name, int age, String gender, int height, int weight , Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }


    public static void main(String[] args) {

    }
}
