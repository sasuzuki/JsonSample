package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ShowDate", urlPatterns = { "/ShowDate" })
public class ShowDateServlet extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String data = createData(1);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("");
		out.println("");
		out.println(data);
		out.println(new java.util.Date());
		out.println("");
		out.println("");
	}

	public String createData(int num) {

		String res = "";

		switch (num) {
		case 0:
			case10: res = "sample";
			return res;
		case 2:
		case 20:
			break;
		default:
			res = "SAMPLE";
			return res;
		}

		return res;
	}

}