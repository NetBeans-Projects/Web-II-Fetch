
package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FetchController", urlPatterns = {"/FetchController"})
public class FetchController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.getWriter().write("success");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Gson gson = new Gson();
        JsonObject fromJson = gson.fromJson(request.getReader(), JsonObject.class);
        String name = fromJson.get("name").getAsString();
        
        System.out.println(name);
        
        JsonObject jo = new JsonObject();
        jo.addProperty("message", "Hello, " + name);
        
        String toJson = gson.toJson(jo);
        response.setContentType("application/json");
        response.getWriter().write(toJson);
        
    }
    
}
