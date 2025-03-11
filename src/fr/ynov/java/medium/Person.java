package fr.ynov.java.medium;

import javax.management.ValueExp;
import java.time.LocalDate;
import java.time.Period;


public class Person {
    private enum Nationality {
        France, Germany , American , Canadian, Russian
    }
    //attributes of person
    private String name;
    private String birthDate;
    private String gender;
    private int height;
    private int weight;
    Nationality nationality;

//Constructor
    Person(String name, String birthDate,String gender, int height, int weight , Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public static void main(String[] args) {


        // create a Person
        Person moi = new Person( "Alexandre" , "2004-06-02" , "male" , 170 , 90 , Nationality.France );
        //transform the string by a Localdate
        LocalDate newBirthDate = LocalDate.parse(moi.getBirthDate());
        // take the dates of the day put it into date
        LocalDate date = LocalDate.now();
        //put the period between those two dates
        Period period = Period.between(newBirthDate, date);


        System.out.println("vous avez " + period.getYears() + " ans");
    }
}
