package servlet.exam05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam05.RequestParamInfoController", urlPatterns="/exam05/RequestParamInfoController")
public class RequestParamInfoController extends HttpServlet{
   

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      
      request.getRequestDispatcher("/WEB-INF/views/exam05/requestParamInfo.jsp").forward(request, response);
      
   }
   


   

}