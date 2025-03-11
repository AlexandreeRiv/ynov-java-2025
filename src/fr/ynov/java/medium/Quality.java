package fr.ynov.java.medium;

import java.time.LocalDate;

public class Quality {
    private int id;
    private String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){

        Quality obj1 = new Quality(1 , "Alexandre");
        Quality obj2 = new Quality(1 , "Alexandre");

        System.out.println(obj1.hashCode());

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Quality obj2) {
            return id == obj2.id && name.equals(obj2.name);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
