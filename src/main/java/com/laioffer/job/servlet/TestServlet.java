package com.laioffer.job.servlet;

import com.laioffer.job.entity.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet",urlPatterns = {"/test"})
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        Item item1 = new Item.Builder()
                .id("item_001")
                .title("California Dream")
                .location("San Francisco")
                .companyLogo("https://abc.com/logo.png")
                .url("https://abc.com")
                .description("Silicon Valley")
                .build();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello, Get!");
    }
}
