package com.kodilla.kodillahashmap;

public class Student {

    private String name;
    private String surname;

    Student (String name, String surname){
        this.name = name;
        this.surname = surname;
    }


    public boolean equals(Object o){
        final Student s = (Student) o;
        return this.name.equals(s.name) && this.surname.equals(s.surname);
    }

    public String getName(){
        return name + " " + surname;
    }
}
}
