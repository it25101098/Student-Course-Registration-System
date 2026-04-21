package service;
import model.CoreCourse;
import model.Course;
import model.ElectiveCourse;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseService {
    private ArrayList<Course> courseList = new ArrayList<>();
    private static final String FILE_NAME ="courses.txt";
    Scanner scanner = new Scanner(System.in);


    //        1. ADD COURSE
     public void addCourse(){
         System.out.println("Select Course Type: ");
         System.out.println("1. Core Course");
         System.out.println("2. Elective Course");

         int choice = scanner.nextInt();
         scanner.nextLine();

         System.out.println("Enter Course ID: ");
         String id = scanner.nextLine();
         System.out.println("Enter Course Name:  ");
         String name = scanner.nextLine();
         System.out.println("Enter Credits: ");
         int credits = scanner.nextInt();
         scanner.nextLine();

         if(choice ==1){
             System.out.println("Enter Department: ");
             String dept = scanner.nextLine();
             CoreCourse c= new CoreCourse(dept,id,name,credits);
             courseList.add(c);
         } else if (choice==2) {
             System.out.println("Enter Specialization: ");
             String spec = scanner.nextLine();
             ElectiveCourse e = new ElectiveCourse(id,name,credits,spec);
             courseList.add(e);
         }
         saveToFile();
         System.out.println("Course Added Sucessfully");

     }
     //        2.VIEW ALL COURSE
    public void viewCourses(){
         if(courseList.isEmpty()){
             System.out.println("No Courses Found.");
             return;
         }
        System.out.println("\n=====All Courses =====");
         for(Course c : courseList){
             c.displayCourse();
             System.out.println("--------------------");
         }
    }
    //           3.UPDATE COURSE
    public  void updateCourse() {
        System.out.println("Enter Course ID to update: ");
        String id = scanner.nextLine();

        for (Course c : courseList) {
            if (c.getCourseId().equals(id)) {
                System.out.println("Enter new Credits: ");
                int newCredits = scanner.nextInt();
                scanner.nextLine();
                c.setCredits(newCredits);
                saveToFile();
                System.out.println("Course Update!");
                return;
            }

        }
        System.out.println("Course not found.");
    }
    //        4.Delete Course
    public void deleteCourse(){
        System.out.println("Enter the Course ID to delete: ");
        String id = scanner.nextLine();

        for(Course c: courseList){
            courseList.remove(c);
            saveToFile();
            System.out.println("Course Deletes!");
            return;
        }
        System.out.println("Course not found.");
    }




}
