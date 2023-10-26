/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentProfile;
import static Business.StudentCourseBean.courseFacultyMap;
import static Business.StudentCourseBean.studentCourseMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author manal
 */
public class StudentCourseAssignmentBean {

    public static HashMap<StudentProfile, Assignment> studentAssignmentMap;

    public static void initialize() {
        studentAssignmentMap = new HashMap<>();

    }
    
     public static void saveStudentCourseAssignment(StudentProfile spp, Course course, Assignment assignment) {
        // Check if the student already exists in the map
        if (!studentAssignmentMap.containsKey(spp)) {
           
            studentAssignmentMap.put(spp,assignment);
        }

        
      
    }

}
