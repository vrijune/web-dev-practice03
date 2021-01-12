package ictgradschool.web.exercise2;

import ictgradschool.web.util.JSONResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "bio-servlet", urlPatterns = {"/biographies"})
public class BioServlet extends HttpServlet {



//TODO: Add the necessary code here to display get the list of biography objects and send them in a response as an JSON string
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    List<Biography> biographyList = BioDataAccess.getBiographies();
    JSONResponse.send(response,biographyList);



}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }
}
