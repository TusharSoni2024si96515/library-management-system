package com.saco.library.web;

import com.saco.library.model.Book;
import com.saco.library.service.LibraryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class BookServlet extends HttpServlet {

    private final LibraryService libraryService = new LibraryService();

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Library Books</h2>");

        for (Book book : libraryService.getAllBooks()) {
            out.println("<p>" + book.getId() + " - "
                    + book.getTitle() + " - "
                    + book.getAuthor() + "</p>");
        }

        out.println("</body></html>");
    }
}
