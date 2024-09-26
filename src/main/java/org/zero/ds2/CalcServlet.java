package org.zero.ds2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.IntStream;

@WebServlet(name = "CalcServlet", value = "/hello")
public class CalcServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Double x = Double.parseDouble(req.getParameter("x"));
        Double e = Double.parseDouble(req.getParameter("e"));
        Integer iterations = Integer.valueOf(req.getParameter("iterations"));

        req.setAttribute("resultRight", rightPart(x, iterations, e));
        req.setAttribute("resultLeft", leftPart(x));
        req.getRequestDispatcher("/WEB-INF/tab.jsp").forward(req, res);
    }

    private Double leftPart(Double x) {
        var sum = 1.0 + x;
        var sumInPow = sum * sum * sum;
        return 1.0 / sumInPow;
    }

    private Double rightPart(Double x, Integer n, Double e) {
        var stepFunction = new FunctionStep();
        return 1.0 + IntStream.range(2, n+1)
                .mapToDouble(iteration -> stepFunction.apply(x, iteration))
                .filter(element -> Math.abs(element) > e)
                .sum();
    }
}