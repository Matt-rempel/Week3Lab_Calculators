package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 584893
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");        
        String second = request.getParameter("second");
        
        String plus = request.getParameter("+");
        String times = request.getParameter("*");
        String minus = request.getParameter("-");
        String mod = request.getParameter("%");

        String message;
                
        try {
            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int result = 0;
            
            if (plus != null) {
                result = firstInt + secondInt;
            } else if (times != null) {
                result = firstInt * secondInt;
            } else if (minus != null) {
                result = firstInt - secondInt;
            } else if (mod != null) {
                result = firstInt % secondInt;
            }
            
            message = String.format("%d", result);
        }
        catch(Exception e) {
            message = "invalid";
        }
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
