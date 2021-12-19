package Mydao;


import java.sql.*;
import MyEntities.User;


public class UserDao {
    private Connection con;
    
    public UserDao(Connection con){
        this.con = con;
    }
    
    public boolean saveUser(User user){
         boolean f= false;
        try{
            
            String query="insert into user(Username,EmailId,Password,MobileNo) values(?,?,?,?)";
            
            PreparedStatement ps = this.con.prepareStatement(query);
            
            ps.setString(1, user.getU_name());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getMobileNo());
            
            ps.executeUpdate();
            f=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    //Forgot password or update password
        public boolean changePassword(String uname,String email,String mobile,String password){
         boolean f= false;
        try{
            
            String query="update user set Password =? where EmailId =? and Username =? and MobileNo =?";
            
            PreparedStatement ps = this.con.prepareStatement(query);
            
            ps.setString(1, password);
            ps.setString(2, email);
            ps.setString(3, uname);
            ps.setString(4, mobile);
            
            ps.executeUpdate();
           f=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    // get user by email and password
    
    public User getUserByEmailAndPassword(String email,String password){
    User user = null;
        
        try{
            String query="select * from user where EmailId =? and Password =?";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet set = ps.executeQuery();
            
            if(set.next()){
            user=new User();
            String Uname=set.getString("Username");
            user.setU_name(Uname);
             String UEmail=set.getString("EmailId");
            user.setEmail(UEmail);
             String UMobile=set.getString(" MobileNo");
            user.setMobileNo(UMobile);
             String UPassword=set.getString("Password");
            user.setPassword(UPassword);
            
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return user;
    }
}
