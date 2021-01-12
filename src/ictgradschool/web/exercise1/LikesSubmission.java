package ictgradschool.web.exercise1;


import com.sun.org.apache.xpath.internal.patterns.NodeTest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "likes-submission", urlPatterns = {"/likes-submission"})
public class LikesSubmission extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Dinosaur> dinosaur = new ArrayList<>();


        String[] name = req.getParameterValues("dinosaurName");
        String[] rating = req.getParameterValues("dinosaurRating");
        String[] note = req.getParameterValues("dinosaurNotes");

        for (int i = 0; i < name.length ; i++) {

            Dinosaur temp = new Dinosaur();
            temp.setName(name[i]);
            temp.setNotes(note[i]);
            temp.setRating(rating[i]);

            dinosaur.add(temp);
        }



//        Iterator it = dinosaur.iterator();
//        while (it.hasNext()) {
//            Dinosaur dinosaurs = (Dinosaur) it.next();
//            System.out.println(dinosaurs.getNotes() + " " + dinosaurs.getName() + dinosaurs.getRating());
//
//        }
//
//        for (int i = 0; i < dinosaur.size(); i++) {
//            System.out.println(dinosaur.get(i));
//
//        }

//        req.setAttribute("dinosaurName", Name);
//        req.setAttribute("dinosaurRating", Rating);
//        req.setAttribute("dinosaurNotes", Note);
        req.setAttribute("dinosaurs", dinosaur);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsppages/dinosaur-summary.jsp");
        dispatcher.forward(req, resp);


    }
// TODO: your code for 1B) here

}
