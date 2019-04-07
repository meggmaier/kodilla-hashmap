package com.kodilla.kodillahashmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class KodillaHashMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaHashMapApplication.class, args);

        Student mark = new Student("Mark","Spencer");
        Student anne = new Student("Anne","Shirley");
        Student tom = new Student("Thomas","Sawyer");

        SubjectGrades mathMark = new SubjectGrades("Math",3);
        SubjectGrades englishMark = new SubjectGrades("English",4);
        SubjectGrades scienceMark = new SubjectGrades("Science",5);
        SubjectGrades ictMark = new SubjectGrades("ICT",3);
        SubjectGrades frenchMark = new SubjectGrades("French",2);

        SubjectGrades mathAnne = new SubjectGrades("Math",4);
        SubjectGrades englishAnne = new SubjectGrades("English",5);
        SubjectGrades scienceAnne = new SubjectGrades("Science",4);
        SubjectGrades ictAnne = new SubjectGrades("ICT",2);
        SubjectGrades frenchAnne = new SubjectGrades("French",5);

        SubjectGrades mathTom = new SubjectGrades("Math",3);
        SubjectGrades englishTom = new SubjectGrades("English",2);
        SubjectGrades scienceTom = new SubjectGrades("Science",3);
        SubjectGrades ictTom = new SubjectGrades("ICT",2);
        SubjectGrades frenchTom = new SubjectGrades("French",2);

        ArrayList<SubjectGrades> gradesMark = new ArrayList<>();

        gradesMark.add(mathMark);
        gradesMark.add(englishMark);
        gradesMark.add(scienceMark);
        gradesMark.add(ictMark);
        gradesMark.add(frenchMark);

        ArrayList<SubjectGrades> gradesAnne = new ArrayList<>();

        gradesAnne.add(mathAnne);
        gradesAnne.add(englishAnne);
        gradesAnne.add(scienceAnne);
        gradesAnne.add(ictAnne);
        gradesAnne.add(frenchAnne);

        ArrayList<SubjectGrades> gradesTom = new ArrayList<>();

        gradesTom.add(mathTom);
        gradesTom.add(englishTom);
        gradesTom.add(scienceTom);
        gradesTom.add(ictTom);
        gradesTom.add(frenchTom);


        HashMap<Student, ArrayList> studentGrades = new HashMap<Student, ArrayList>();

        studentGrades.put(mark, gradesMark);
        studentGrades.put(anne, gradesAnne);
        studentGrades.put(tom, gradesTom);

        double sumMark = 0;
        double sumTom = 0;
        double sumAnne = 0;


        for(SubjectGrades grades : gradesMark){
            sumMark+=grades.getSubjectGrades();
        }

        for(SubjectGrades grades : gradesAnne){
            sumAnne+=grades.getSubjectGrades();
        }

        for(SubjectGrades grades : gradesTom){
            sumTom+=grades.getSubjectGrades();
        }


        double averageMark = sumMark/gradesMark.size();
        double averageAnne = sumAnne/gradesAnne.size();
        double averageTom = sumTom/gradesTom.size();


        System.out.println("The grades average of " + mark.getName() + " equals: " + averageMark + ".");
        System.out.println("The grades average of " + anne.getName() + " equals: " + averageAnne + ".");
        System.out.println("The grades average of " + tom.getName() + " equals: " + averageTom + ".");





    }

}
