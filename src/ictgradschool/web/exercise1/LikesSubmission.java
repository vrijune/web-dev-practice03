package ictgradschool.web.exercise1;


import com.sun.org.apache.xpath.internal.patterns.NodeTest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "likes-submission", urlPatterns = {"/likes-submission"})
public class LikesSubmission extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dinosaur dinosaur = new Dinosaur();

        String names = req.getParameter("dinosaurName");
        String ratings = req.getParameter("dinosaurRating");
        String notes = req.getParameter("dinosaurNotes");
        req.setAttribute("dinosaurName",names);
        req.setAttribute("dinosaurRating",ratings);
        req.setAttribute("dinosaurNotes",notes);
        req.setAttribute("dinosaur",dinosaur);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jspages/dinosaur-summary.jsp");
        dispatcher.forward(req, resp);





    }
// TODO: your code for 1B) here

}
