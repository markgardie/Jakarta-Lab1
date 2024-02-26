package com.markgardie.jakartalab1
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet(name = "mainServlet", value = ["/main-servlet"])
class MainServlet : HttpServlet() {

    private val message = "This is MainServlet"
    private val jakartaDocsUrl = "https://jakarta.ee/specifications/"

    public override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        response.contentType = "text/html"
        // Hello
        response.writer.apply {
            println("<html><body>")
            println("<h1>$message</h1>")
            println("<a href=\"$jakartaDocsUrl\"> Read Docs here </a>")
            println("</body></html>")
        }

    }

    override fun destroy() {
    }
}