package etu1748.framework.servlet;

import etu1748.framework.util.Util;

import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FrontServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        System.out.println(Util.getBaseURL(req.getRequestURL().toString()));
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        processRequest(req, res);
    }

    protected void doPost(final HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        processRequest(req, res);
    }
}