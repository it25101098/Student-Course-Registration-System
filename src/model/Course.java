package model;

public class Course {
    //Attributes
    private String courseId;
    private String courseName;
    private int credits;
    //Parameterized Constructor
    public Course(String courseId,String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
    }
    // Create setter for credits

    public void setCredits(int credits) {
        if (credits<0){
            System.out.println("Credit should be a positive number ");
        }
        else {
            this.credits = credits;
        }
    }

    // Create the getters


    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getCredits() {
        return credits;
    }
    //Display
    public void displayCourse(){
        System.out.println("Course Id: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Credits: "+credits);
    }
}
