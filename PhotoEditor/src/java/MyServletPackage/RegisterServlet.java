package MyServletPackage;

import MyEntities.User;
import MyHelperClasses.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import Mydao.UserDao;


public class RegisterServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>welcome to register servlet</h1>");
      
        String UPass1 = request.getParameter("Pass1");
        String UPass2 = request.getParameter("Pass2");
        if(UPass1.equals(UPass2)){
        String Uname = request.getParameter("Username");
        String UEmail = request.getParameter("Email");
        String UMobile = request.getParameter("Mobile_Number");
        
        //create user object
        User user=new User(Uname,UEmail,UMobile,UPass1);
        
        //create a user dao
        UserDao dao=new UserDao(ConnectionProvider.getConnection());
        boolean b = dao.saveUser(user);
        if(b){
        out.println("Done");
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        }else{
        out.println("error"+b);
        }
        }else{
         out.println(" password is not matched");
        
        }
        
    }
}
