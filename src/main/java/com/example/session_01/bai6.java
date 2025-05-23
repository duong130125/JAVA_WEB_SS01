package com.example.session_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "bai6", value = "/bai6")
public class bai6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("bai6.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        handleRegister(req, resp);
    }

    protected void handleRegister(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String className = req.getParameter("className");
        String vehicleType = req.getParameter("vehicleType");
        String plateNumber = req.getParameter("plateNumber");

        boolean isValid = fullName != null && !fullName.isEmpty()
                && className != null && !className.isEmpty()
                && vehicleType != null && !vehicleType.isEmpty()
                && plateNumber != null && !plateNumber.isEmpty();

        if (isValid) {
            req.setAttribute("status", "success");
            req.setAttribute("fullName", fullName);
            req.setAttribute("className", className);
            req.setAttribute("vehicleType", vehicleType);
            req.setAttribute("plateNumber", plateNumber);
        } else {
            req.setAttribute("status", "fail");
        }

        req.getRequestDispatcher("resultRegister.jsp").forward(req, resp);
    }
}