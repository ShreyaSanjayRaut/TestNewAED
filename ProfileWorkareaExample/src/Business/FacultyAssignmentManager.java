package Business;
import java.util.ArrayList;
import java.util.List;

public class FacultyAssignmentManager {
  

    public FacultyAssignmentManager() {
      
    }

    
    // Create a new assignment for a course
    public void createAssignment(Course course, Assignment assignment) {
       
            course.addAssignment(assignment);
        
    }

    // Get a list of assignments for a specific course
    public List<Assignment> getAssignmentsForCourse(Course course) {
        return course.getAssignments();
    }

    
}
