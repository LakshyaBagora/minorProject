package dto;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 *
 * @author Pankaj
 */
public class UserDTO 
{
    private String email,password;
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}