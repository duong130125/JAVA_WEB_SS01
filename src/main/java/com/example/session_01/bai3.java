package com.example.session_01;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "bai3", value = "/bai3")
public class bai3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "Nguyễn Đình Dương";
        int age = 20;
        request.setAttribute("userName", name);
        request.setAttribute("userAge", age);

        RequestDispatcher dispatcher = request.getRequestDispatcher("bai3.jsp");
        dispatcher.forward(request, response);
    }
}