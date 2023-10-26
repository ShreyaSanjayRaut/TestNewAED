/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import ManagerBean.CourseManagerBean;
import java.util.Date;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {
    static PersonDirectory persondirectory=null;
    static Business business = null;

    static Business initialize() {
      business = new Business("Information Systems");

// Create Persons
         persondirectory = business.getPersonDirectory();
// person representing sales organization        
        /*  Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");

// Create person objects to represent customer organizations. 
        Person person005 = persondirectory.newPerson("Dell");
        Person person006 = persondirectory.newPerson("Microsoft");
        Person person007 = persondirectory.newPerson("Google");
        Person person008 = persondirectory.newPerson("JP Morgan");
        Person person009 = persondirectory.newPerson("State street"); //we use this as customer 

// Create Customers*/

// Create Admins to manage the business
        Person xeroxadminperson001 = persondirectory.newPerson("Admin admin");
        xeroxadminperson001.setFirstName("Shreya");
        xeroxadminperson001.setLastName("Raut");
        xeroxadminperson001.setEmail("shreya@gmail.om");
        xeroxadminperson001.setPhoneNumber("9028258152");
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "XXXX");
        ua3.setPassword("XXXX");/// order products for one of the customers and performed by a sales person

        Person student01 = persondirectory.newPerson("S01");
         student01.setFirstName("Student1");
        student01.setLastName("student rat");
        student01.setEmail("shreyastuden@gmail.om");
        student01.setPhoneNumber("sty9028258152");
        StudentDirectory studentdirectory = business.getStudentDirectory();
        //    EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        StudentProfile studentProfile = studentdirectory.newStudentProfile(student01);

        UserAccount ua2 = uadirectory.newUserAccount(studentProfile, "s", "s"); /// order products for one of the customers and performed by a sales person
        ua2.setPassword("s");
        
         Person student02 = persondirectory.newPerson("S02");
      //  StudentDirectory studentdirectory = business.getStudentDirectory();
        //    EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        StudentProfile studentProfile02 = studentdirectory.newStudentProfile(student02);

        UserAccount su2 = uadirectory.newUserAccount(studentProfile02, "m", "m"); /// order products for one of the customers and performed by a sales person

        
        Person faculty01 =  persondirectory.newPerson("F01");
        
        faculty01.setType("Faculty");
        faculty01.setFirstName("Vishal ");
        faculty01.setLastName("Chawda");
        faculty01.setEmail("shreyafac@gmail.om");
        faculty01.setPhoneNumber("fac9028258152");
        faculty01.addRating("Vishal", 6);
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        //    EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        FacultyProfile facultyProfile = facultydirectory.newFacultyProfile(new Person("Vishal"));
        UserAccount ua1 = uadirectory.newUserAccount(facultyProfile, "f", "f"); 
        
        Person faculty02 =   persondirectory.newPerson("KAL");
        
        faculty02.setType("Faculty");
        faculty02.setFirstName("KAL");
        faculty02.setLastName("Bulgra");
        faculty02.setEmail("shreyafac@gmail.om");
        faculty02.setPhoneNumber("fac9028258152");
        faculty02.addRating("KAL", 7);
        FacultyDirectory facultydirectory2 = business.getFacultyDirectory();
         
        FacultyDirectory directory=business.getFacultyDirectory();
        FacultyProfile profile =directory.newFacultyProfile(new Person("KAL"));
        
         Person faculty03 =  persondirectory.newPerson("AMUTHAN");
        
        faculty03.setType("Faculty");
        faculty03.setFirstName("AMUTHAN");
        faculty03.setLastName("Reddy");
        faculty03.setEmail("shreyafac@gmail.om");
        faculty03.setPhoneNumber("fac9028258152");
        faculty03.addRating("AMUTHAN", 9);
        FacultyDirectory facultydirectory3 = business.getFacultyDirectory();
         
        FacultyDirectory directory3=business.getFacultyDirectory();
        FacultyProfile profile3 =directory3.newFacultyProfile(new Person("AMUTHAN"));
        
        Person faculty04 =  faculty04 = persondirectory.newPerson("Nick");
        
        faculty04.setType("Faculty");
        faculty04.setFirstName("Nick");
        faculty04.setLastName("Jonas");
        faculty04.setEmail("shreyafac@gmail.om");
        faculty04.setPhoneNumber("fac9028258152");
        faculty04.addRating("Nick", 9);
        faculty04.addRating("Nick", 2);
        FacultyDirectory facultydirectory4 = business.getFacultyDirectory();
         
        FacultyDirectory directory4=business.getFacultyDirectory();
        FacultyProfile profile4 =directory4.newFacultyProfile(new Person("Nick"));
        profile4.setQualification("MS");
        double rating = faculty04.calculateAverageRating("Nick");
        profile4.setRating(rating);
       
        System.out.println("ratig"+profile4.getRating());
        //System.out.println("UserInterface.WorkAreas.StudentRole.StudentCourseRegisterationJPanel.temp()");
       
            
        return business;

    }
    
    static CourseList getCourse()
    {
         CourseList courseList = new CourseList();
        // Convert ArrayList to an array
        Course course = courseList.addNewCourse();
        course.setCourseCode("5100");
        course.setCredit(4);
        course.setCourseName("AED");
       
        Course course2 = courseList.addNewCourse();
        course2.setCourseCode("6100");
        course2.setCredit(4);
        course2.setCourseName("web");

        Course course3 = courseList.addNewCourse();
        course3.setCourseCode("7100");
        course3.setCredit(4);
        course3.setCourseName("cloud");

        Assignment assignment = new Assignment(0, "assignmemt-1",business.getFacultyDirectory().findFaculty("KAL").getPerson().getId(), course,100, new Date("11/10/2023"));
        
        course.addAssignment(assignment);
        
         Assignment assignment2 = new Assignment(0, "assignmemt-1",business.getFacultyDirectory().findFaculty("AMUTHAN").getPerson().getId(), course,100,new Date("11/10/2023"));
        course2.addAssignment(assignment2);
        
        
         return courseList;

    }

}
