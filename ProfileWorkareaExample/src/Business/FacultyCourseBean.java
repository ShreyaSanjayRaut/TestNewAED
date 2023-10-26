/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Profiles.FacultyProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author manal
 */
public class FacultyCourseBean {
    

    
    private static HashMap<Course, List<FacultyProfile>> courseFacultyMap;
    
    public static void initalize() {
        courseFacultyMap = new HashMap<>();
        
        
    }

    public static void saveCourse(Course course, FacultyProfile profile) {
        // Check if the course already exists in the map
     
        if (!courseFacultyMap.containsKey(course)) {
            courseFacultyMap.put(course, new ArrayList<>());
        }

        // Add the professor to the list of professors for the course
        courseFacultyMap.get(course).add(profile);
       // System.out.println("Business.FacultyCourseBean.saveCourse()" + courseFacultyMap.toString());
    }

    public static List<FacultyProfile> getFacultyForCourse(Course course) {
        // Retrieve the list of professors for a given course
        //System.out.println("Business.FacultyCourseBean.getFacultyForCourse()" + courseFacultyMap.toString());
        return courseFacultyMap.get(course);
    }
    
  
    
}
