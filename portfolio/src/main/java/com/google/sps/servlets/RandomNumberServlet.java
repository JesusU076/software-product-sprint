package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that returns a random number from 0 to 9 */
@WebServlet("/random-number")
public class RandomNumberServlet extends HttpServlet {


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.getWriter().println("Your Random number is: ");
    response.getWriter().println(Math.floor(Math.random() * 10));
  }
}
