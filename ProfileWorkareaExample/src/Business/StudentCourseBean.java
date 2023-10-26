package Business;

import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentCourseBean {

    public static HashMap<StudentProfile, List<Course>> studentCourseMap = new HashMap<>();
    public static HashMap<Course, FacultyProfile> courseFacultyMap = new HashMap<>();

    public static void initialize() {
        studentCourseMap = new HashMap<>();
        courseFacultyMap = new HashMap<>();
    }

    public static void saveStudentCourseFaculty(StudentProfile student, Course course, FacultyProfile faculty) {
        // Check if the student already exists in the map
        
        System.out.println("Business.StudentCourseBean.saveStudentCourseFaculty()" +  student.getPerson().getId());
        if (!studentCourseMap.containsKey(student)) {
            studentCourseMap.put(student, new ArrayList<>());
        }

        // Add the course to the student's list
        List<Course> studentCourses = studentCourseMap.get(student);
        studentCourses.add(course);

        // Map the course to its faculty
        courseFacultyMap.put(course, faculty);
    }

    public static FacultyProfile getFacultyForStudentCourse(StudentProfile student, Course course) {
        // Retrieve the faculty for a given course
        FacultyProfile faculty = courseFacultyMap.get(course);
        return faculty;
    }

    public static void displayStudentCourseFaculty() {
        for (StudentProfile student : studentCourseMap.keySet()) {
           // System.out.print("\tStudent: " + student.getPerson().getId());

            List<Course> studentCourses = studentCourseMap.get(student);

            for (Course course : studentCourses) {
                //System.out.print("\tCourse: " + course.getCourseName());

                FacultyProfile faculty = courseFacultyMap.get(course);

                //System.out.print("\tFaculty: " + faculty.getPerson().getId());
            }
            System.out.println("");
        }
    }
}
