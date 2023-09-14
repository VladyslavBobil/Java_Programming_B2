package day05_variebles;

public class School {
    public static void main(String[] args) {
        int     numberOfStudentsInGrade1 = 31,
                numberOfStudentsInGrade2 = 40,
                numberOfStudentsInGrade3 = 25,
                numberOfStudentsInGrade4 = 10,
                numberOfStudentsInGrade5 = 38,
                totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 +numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;
        System.out.println("The total number of students is " + totalNumberOfStudents);

        double numberOfDaysInAYear = 100.5 ,
                numberOfSnowDaysInAYear = 10,
                averageGPAInSchool = 3.5;
        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of students in Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of students in Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of students in Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of students in Grade 5: " + numberOfStudentsInGrade5);
        System.out.println("Total number of students in the school is : " + totalNumberOfStudents);
        System.out.println("Numbers of Days in a year : " + numberOfDaysInAYear);
        System.out.println("Numbers of snow days in a year : " + numberOfSnowDaysInAYear );
        System.out.println("Average GPA in the school is : " + averageGPAInSchool);

    }
}

/*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/