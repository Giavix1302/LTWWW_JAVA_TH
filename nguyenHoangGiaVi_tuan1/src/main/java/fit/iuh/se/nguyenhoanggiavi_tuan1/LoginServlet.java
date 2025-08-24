package fit.iuh.se.nguyenhoanggiavi_tuan1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    // Xử lý khi user mở URL /login trực tiếp (GET request)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Chuyển hướng người dùng tới trang form nhập liệu register.html
        response.sendRedirect("login.html");
    }

    // Xử lý khi user submit form (POST request)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Đặt charset để nhận dữ liệu tiếng Việt đúng
        request.setCharacterEncoding("UTF-8");

        // Lấy dữ liệu từ form gửi lên
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String facebook = request.getParameter("facebook");
        String shortBio = request.getParameter("shortBio");

        // Thiết lập kiểu dữ liệu trả về là HTML và charset UTF-8
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        // Xuất ra trang HTML kết quả
        out.println("<html>");
        out.println("<head><title>Result Page</title></head>");
        out.println("<body>");
        out.println("<h2>Registration Information</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Facebook:</b> " + facebook + "</p>");
        out.println("<p><b>Short Bio:</b><br/>" + shortBio + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
