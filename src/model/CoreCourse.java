package model;

public class CoreCourse extends Course {
    //Attributes
    private String department; // instance variables
    //Parameterized Constructor
    CoreCourse(String department, String courseId , String courseName, int credits ){
        super(courseId, courseName, credits);
        this.department=department;

    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Department : "+department);
    }
}
