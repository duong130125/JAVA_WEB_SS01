package com.example.session_01;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bai7", value = "/bai7")
public class bai7 extends HttpServlet {
    private static final List<Student> studentList = new ArrayList<>();
    @Override
    public void init() throws ServletException {
        super.init();
        studentList.add(new Student("Nguyễn Văn Hùng", "12A3", "Xe máy", "30P1-86868"));
        studentList.add(new Student("Trần Thị Bình", "11C1", "Xe điện", "59MĐ-99999"));
        studentList.add(new Student("Lê Văn Luyện", "11D", "Xe máy", "37B1-40817"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("students", studentList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("bai7.jsp");
        dispatcher.forward(req, resp);
    }

}