package org.zero.ds2.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zero.ds2.service.SumService;

import java.io.IOException;

@WebServlet("/sum")
public class SumServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Double x = Double.parseDouble(req.getParameter("x"));
        Double e = Double.parseDouble(req.getParameter("e"));
        Integer iterations = Integer.valueOf(req.getParameter("iterations"));

        var calculator = new SumService(x, iterations, e).calculate();

        req.setAttribute("x", x);
        req.setAttribute("e", e);
        req.setAttribute("iterations", iterations);
        req.setAttribute("resultRight", calculator.getFirst());
        req.setAttribute("resultLeft", calculator.getSecond());

        req.getRequestDispatcher("/WEB-INF/sum.jsp").forward(req, res);
    }

}