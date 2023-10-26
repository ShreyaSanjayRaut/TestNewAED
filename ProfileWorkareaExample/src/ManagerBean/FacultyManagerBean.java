/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerBean;

import Business.CourseList;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;

/**
 *
 * @author manal
 */
public class FacultyManagerBean {
    
     private FacultyDirectory list;
    
    public FacultyManagerBean(FacultyDirectory list)
    {
        this.list = list;
    }
    
    public FacultyProfile findFacultyByID(String id)
    {
        return list.findFaculty(id);
        
    }
    
    
    
}
