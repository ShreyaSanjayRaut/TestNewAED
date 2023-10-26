/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Profiles;
 
import Business.Business;
import Business.Person.Person;
 
import java.util.ArrayList;
 
/**
*
* @author kal bugrara
*/
public class FacultyDirectory {
 
    Business business;
    ArrayList<FacultyProfile> facultylist;
 
    public FacultyDirectory(Business d) {
 
        business = d;
        facultylist = new ArrayList();
 
    }
 
    
 
    public FacultyProfile newFacultyProfile(Person p) {
 
        FacultyProfile sp = new FacultyProfile(p);
        facultylist.add(sp);
        return sp;
    }
 
    public FacultyProfile findFaculty(String id) {
 
        for (FacultyProfile sp : facultylist) {
 
            if (sp.isMatch(id)) {
              //  System.out.println("find faculty*********");
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
}