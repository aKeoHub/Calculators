package ca.sait.calculators.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kingston
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String message;

        if (firstInput != null && secondInput != null) {
            try {
                int first = Integer.parseInt(firstInput);
                int second = Integer.parseInt(secondInput);
                String operation = request.getParameter("operation");
                message = "Result";
                if (operation.equals("+")) {
                    message = String.format("%s: %d", message, first + second);
                } else if (operation.equals("-")) {
                    message = String.format("%s: %d", message, first - second);
                } else if (operation.equals("*")) {
                    message = String.format("%s: %d", message, first * second);
                } else if (operation.equals("%")) {
                    message = String.format("%s: %d", message, first % second);
                }

                request.setAttribute("message", message);
                request.setAttribute("first", firstInput);
                request.setAttribute("second", secondInput);
            } catch (Exception ex) {
                //Age input exists but is not a number

            }
        } else {
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
