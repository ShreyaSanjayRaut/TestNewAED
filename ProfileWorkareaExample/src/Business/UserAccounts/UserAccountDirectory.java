/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;

import java.util.ArrayList;
import java.security.SecureRandom;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
    
      ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();

    }

    
    public UserAccount newUserAccount(Profile p, String un, String pw) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        int length = 6;
         SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }
        String newpw = password.toString();
        UserAccount ua = new UserAccount (p,  un,  newpw);
        useraccountlist.add(ua);
        return ua;
    }
    
    
    public UserAccount updateloginInfo (String id , String un, String pw) {

       System.out.println("inside updateloginifo"+id+"un"+un);

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
               ua.password = pw;
               ua.username= un;
                return ua;
            }
        }
            return null; //not found after going through the whole list
         
    }
    

    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
     public UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
     
     
     public ArrayList<UserAccount> getUserAccountList()
     {
         return useraccountlist;
     }
}
