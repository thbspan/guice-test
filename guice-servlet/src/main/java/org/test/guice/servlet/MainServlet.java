package org.test.guice.servlet;

import com.google.inject.Injector;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.test.guice.dto.Information;

import java.io.IOException;

@Singleton
public class MainServlet extends HttpServlet {
    @Inject
    private Injector injector;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.setAttribute("name", name);
        Information info = injector.getInstance(Information.class);
        req.setAttribute("params", info.getAllParameters());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
