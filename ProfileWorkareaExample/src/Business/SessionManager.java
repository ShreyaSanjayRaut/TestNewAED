/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Person.Person;
import Business.UserAccounts.UserAccount;

/**
 *
 * @author shrey
 */
public class SessionManager {
    
     private static UserAccount currentUser;

    public static void setCurrentUser(UserAccount user) {
        currentUser = user;
    }

    public static UserAccount getCurrentUser() {
        return currentUser;
    }
    
    
}
