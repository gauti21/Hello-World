package upgrad;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// A servlet is essentially a Java class that responds to HTTP requests.

@WebServlet("/helloworld") //this tells spring boot that this class is java servlet
//we used "/helloworld because through this we can we acces this local server. (localhost:8080/helloworld)"
public class HelloWorldServlet extends HttpServlet { //HttpServlet would facilitate all the HTTP operations
    //we use service method to use all 4 operations - get,post,put,delete.
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Writer Object - gives you an output stream through which we can respond back to the client
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<!Doctype html>");
        printWriter.print("<html>");
        printWriter.print("<head>");
        printWriter.print("<title>Hello guys</title>");
        printWriter.print("</head>");
        printWriter.print("<body>");
        printWriter.print("<p>Hello World</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }

}
