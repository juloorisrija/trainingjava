package org.example;

public class FindCourse {


    String courseName;
   int courseId;
   double fee ;
   FindCourse(String courseName,int courseId,double fee) {

           this.courseName = courseName;
           this.courseId = courseId;
           this.fee = fee;


   }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
