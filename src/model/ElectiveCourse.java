package model;

public class ElectiveCourse extends Course {
    //Attributes
    private String specialization;

    //Parameterized Constructor
    public ElectiveCourse(String courseId,String courseName,int credits, String specialization){
        super(courseId, courseName, credits);
        this.specialization=specialization;
    }


}
