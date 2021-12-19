package MyServletPackage;


import MyEntities.User;
import MyHelperClasses.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import Mydao.UserDao;

public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>welcome to Login servlet</h1>");
      
        // fetch detail from request
        
        String Email=request.getParameter("email");
        String userPassword=request.getParameter("password");
        
        UserDao dao=new UserDao(ConnectionProvider.getConnection());
        User u=dao.getUserByEmailAndPassword(Email, userPassword);
        if(u==null){
            response.sendRedirect("invalidPage.jsp");
           
        }else{
            HttpSession s=request.getSession();
            s.setAttribute("currentUser", u);
            response.sendRedirect("MainPhotoEditor/index.html");
        }
    }
}
