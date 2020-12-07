package controller;

import domain.model.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Overview extends RequestHandler {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        List<Product> broodjes = service.getAllBroodjes();
        List<Product> pastas = service.getAllPasta();
        List<Product> soepen = service.getAllSoepen();
        request.setAttribute("broodjes", broodjes);
        request.setAttribute("pastas", pastas);
        request.setAttribute("soepen", soepen);
        return "productoverview.jsp";
    }
}
