package model;

public class ElectiveCourse extends Course {
    //Attributes
    private String specialization;

    //Parameterized Constructor
    public ElectiveCourse(String courseId,String courseName,int credits, String specialization){
        super(courseId, courseName, credits);
        this.specialization=specialization;
    }
    // Create the Getter and Setter


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    // Override display method
    @Override
    public void displayCourse() {
        super.displayCourse();
        this.specialization=specialization;
    }
}
