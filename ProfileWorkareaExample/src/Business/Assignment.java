package  Business;
import Business.Course;
import Business.Profiles.StudentProfile;

import java.util.Date; // Import Date class
import java.util.HashMap;
import java.util.Map;

public class Assignment {
    private int assignmentId;
    private String assignmentName;
    private String createdBy;
    private Course course;
    private double marks;
    private Date submissionDate; // New field for submission date
   private Map<StudentProfile, String> subMissionLink; // Use a map to store marks for each student

    private String status="Not submitted";
    private Map<StudentProfile, Integer> marksObtained; // Use a map to store marks for each student


    public Assignment(int assignmentId, String assignmentName, String createdBy, Course course, double marks, Date submissionDate) {
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
        this.createdBy = createdBy;
        this.course = course;
        this.marks = marks;
        this.submissionDate = submissionDate;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Map<StudentProfile, String> getSubMissionLink() {
        return subMissionLink;
    }

    public void setSubMissionLink(Map<StudentProfile, String> subMissionLink) {
        this.subMissionLink = subMissionLink;
    }

    public Map<StudentProfile, Integer> getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(Map<StudentProfile, Integer> marksObtained) {
        this.marksObtained = marksObtained;
    }

    

    @Override
    public String toString() {
        return assignmentName ;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
     public void assignMarks(StudentProfile student, int marks) {
        marksObtained.put(student, marks);
    }

    public int getMarksForStudent(StudentProfile student) {
        return marksObtained.getOrDefault(student, -1); // Return -1 if no mark is assigned
    }
    
    
     public void addSubmissionLink(StudentProfile student, String submissionLink) {
       subMissionLink = new HashMap<>();
       subMissionLink.put(student, submissionLink);
    }

    public String getSubmissionLinkStudent(StudentProfile student) {
        return subMissionLink.getOrDefault(student, ""); // Return -1 if no mark is assigned
    }
    
    
}

