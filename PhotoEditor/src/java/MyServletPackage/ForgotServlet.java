package MyServletPackage;


import MyEntities.User;
import MyHelperClasses.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import Mydao.UserDao;

public class ForgotServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>welcome to Forgot servlet</h1>");
      
        // fetch detail from request
        
        String UPass1 = request.getParameter("Pass1");
        String UPass2 = request.getParameter("Pass2");
        if(UPass1.equals(UPass2)){
            String Uname = request.getParameter("Username");
        String UEmail = request.getParameter("Email");
        String UMobile = request.getParameter("Mobile_Number");
        
       
        
        //create a user dao
        UserDao dao=new UserDao(ConnectionProvider.getConnection());
        if(dao.changePassword(Uname, UEmail, UMobile, UPass1)){
        out.println("Done");
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        }else{
        out.println("error");
        }
        }else{
         out.println(" password is not matched");
        
        }
        
    }
}
