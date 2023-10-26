  /*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Profiles;
 
import Business.Person.Person;
 
/**
*
* @author kal bugrara
*/
public class FacultyProfile extends Profile {
 
 
    double rating;
    String qualification; 

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public FacultyProfile(Person p) {
 
        super(p);
 
    }
    @Override
    public String getRole(){
        return  "Faculty";
    }
 
}