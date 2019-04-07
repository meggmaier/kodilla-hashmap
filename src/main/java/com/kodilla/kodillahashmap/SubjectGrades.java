package com.kodilla.kodillahashmap;

public class SubjectGrades {

    private String subject;
    private int grade;

    SubjectGrades (String subject, int grade){
        this.subject = subject;
        this.grade = grade;
    }

    public double getSubjectGrades(){
        return grade;
    }
}
