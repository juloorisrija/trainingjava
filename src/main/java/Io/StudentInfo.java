package Io;

import com.training.java.Candidate;

import java.util.Date;

public class StudentInfo {
   private int candidateId;
   private String candidateName;
   private String courseEnrolled;

   private Date date;
    public StudentInfo(int candidateId, String candidateName, String courseEnrolled) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.courseEnrolled = courseEnrolled;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                '}';
    }
}
