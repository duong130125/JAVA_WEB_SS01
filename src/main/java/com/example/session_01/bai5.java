package com.example.session_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "bai5", value = "/bai5")
public class bai5 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int result = 10 / 0;
            response.setContentType("text/html");
            response.getWriter().println("Kết quả là: " + result);
        } catch (Exception e) {
            request.setAttribute("errorMessage", "Đã xảy ra lỗi trong quá trình xử lý: " + e.getMessage());
            request.getRequestDispatcher("bai5.jsp").forward(request, response);
        }
    }
}