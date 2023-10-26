/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerBean;

import Business.Assignment;
import Business.Course;
import Business.CourseList;
import Business.FacultyCourseBean;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentProfile;
import Business.StudentCourseBean;
import static Business.StudentCourseBean.courseFacultyMap;
import static Business.StudentCourseBean.studentCourseMap;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manal
 */
public class CourseManagerBean {
    
    private CourseList list;
    
    public CourseManagerBean(CourseList list)
    {
        this.list = list;
         StudentCourseBean.initialize();
    }
    
  
    public List<FacultyProfile> findFacultyByCourse(String courseName)
    {
        
        if(courseName!=null)
        {
         Course course = findCourse(courseName); 
         if(course!=null){
            // System.out.println("ManagerBean.CourseManagerBean.findFacultyByCourse()");
          List<FacultyProfile>  facultyList=FacultyCourseBean.getFacultyForCourse(course) ; 
              return facultyList;
          
        }
        }
        
        return null;
    }
    
    
    

    public Course findCourse(String courseName) {
        
        ArrayList<Course> clist =list.getCourseList();
        for(Course course : clist)
        {
           // System.out.println("1111");
            if(course.getCourseName().equals(courseName))
            {
              //  System.out.println("ManagerBean.CourseManagerBean.findCourse()" + course.getCourseName());
              //  System.out.println("11***1"+course.toString());
                return course;
            }
        }  
       // System.out.println("11222*1");
        return null;
    }
    
    public void enrollForCourse(Course course, StudentProfile student,FacultyProfile faculty)
    {
       
        StudentCourseBean.saveStudentCourseFaculty(student, course, faculty);
    }
    
    public List<Assignment> findAssignmentByCourse(Course course)
    {
        if(course!=null){
              List<Assignment> assignmentList = course.getAssignments();
        return assignmentList;
        }
        return null;
    }
    
    public List<Course> findCourseListByStudentProfile(StudentProfile student)
    {
  
    
            return studentCourseMap.get(student);

         
    }
    
    
    
}
