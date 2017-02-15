package Module3.Task_3_3;

import java.util.Date;

/**
 * Created by Lina.Burkalo on 15.02.2017.
 */
public class Solution {
    public static void main(String[] args) {

        Course first = new Course(new Date(), "Katya");
        Course second = new Course(45, "Chemistry", "Andy");
        Course third = new Course(new Date(), "Java");
        Course fourth = new Course(90, "Scrum", "Alex");
        Course fifth = new Course(100, "Agile", "Vadym");

        Student student1 = new Student("Lina", "Burkalo", 6);
        Student student2 = new Student("Cimbal", new Course[]{fifth});

        CollegeStudent collegeStudent1 = new CollegeStudent("Sveta", "Lukash", 5);
        CollegeStudent collegeStudent2 = new CollegeStudent("Panek", new Course[]{second});
        CollegeStudent collegeStudent3 = new CollegeStudent("GoIt", 95, 5624666);

        SpecialStudent specialStudent1 = new SpecialStudent("Igor", "Lis", 9);
        SpecialStudent specialStudent2 = new SpecialStudent("Mercy", 80, 54793);
        SpecialStudent specialStudent3 = new SpecialStudent(987333);

    }
}
