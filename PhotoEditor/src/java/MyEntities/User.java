package MyEntities;

import java.sql.*;
public class User {

    private String u_name;
    private String email;
    private String mobileNo;
    private String password;

    public User(String u_name, String email, String mobileNo, String password) {
        this.u_name = u_name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
    }
    
    public User(){
    
    }
    
 // getters and setters

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
