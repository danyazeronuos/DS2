package org.zero.ds2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zero.ds2.service.SumService;
import org.zero.ds2.service.TabulationService;

import java.io.IOException;

@WebServlet("/tabulation")
public class TabulationServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Double start = Double.parseDouble(req.getParameter("start"));
        Double finish = Double.parseDouble(req.getParameter("finish"));
        Double step = Double.parseDouble(req.getParameter("step"));

        var calculator = new TabulationService(start, finish, step);

        req.setAttribute("start", start);
        req.setAttribute("finish", finish);
        req.setAttribute("step", step);
        req.setAttribute("result", calculator.calculate());

        req.getRequestDispatcher("/WEB-INF/tab.jsp").forward(req, res);
    }

}