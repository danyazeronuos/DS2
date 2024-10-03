package org.zero.ds2.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.zero.ds2.model.Calculator;
import org.zero.ds2.model.ResultModel;
import org.zero.ds2.service.SumService;
import org.zero.ds2.utils.CalculateStrategy;

import java.io.IOException;

@WebServlet("/sum")
public class SumServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Double x = Double.parseDouble(req.getParameter("x"));
        Double e = Double.parseDouble(req.getParameter("e"));
        Double iterations = Double.parseDouble(req.getParameter("iterations"));

        var calculator = new CalculateStrategy(new SumService());
        var calculatorResult = calculator.calculate(x, iterations, e);
        var resultModel = new ResultModel(
                x,
                e,
                iterations,
                calculatorResult
        );

        req.setAttribute("result", resultModel);

        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, res);
    }

}