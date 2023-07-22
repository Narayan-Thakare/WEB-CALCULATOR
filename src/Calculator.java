

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter p	=resp.getWriter();	

		
		int num1 =Integer.parseInt(req.getParameter("number1"));
		int num2=Integer.parseInt(req.getParameter("number2"));
		String op=req.getParameter("operator");
		  switch (op) {
          case "+":
        	  RequestDispatcher rd=req.getRequestDispatcher("index.html");
        	  rd.include(req, resp);
              p.print("Sum: " + (num1 + num2));
              
              
              break;
          case "-":
        	  RequestDispatcher rd1=req.getRequestDispatcher("index.html");
        	  rd1.include(req, resp);
              p.print("Subtraction: " + (num1 - num2));
              break;
          case "*":
        	  RequestDispatcher rd11=req.getRequestDispatcher("index.html");
        	  rd11.include(req, resp);
              p.print("Multiplication: " + (num1 * num2));
              break;
          case "/":
        	  RequestDispatcher rd111=req.getRequestDispatcher("index.html");
        	  rd111.include(req, resp);
              if (num2 != 0) {
                  p.print("Division: " + (num1 / num2));
              } else {
                  p.print("Error: Division by zero is not allowed!");
              }
              break;
          default:
              p.print("Invalid operator");
              break;
      }
		
		
		
		
	}

}
