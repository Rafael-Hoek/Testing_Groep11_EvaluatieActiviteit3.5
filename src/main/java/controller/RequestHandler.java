package controller;


import domain.model.DomainException;
import domain.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public abstract class RequestHandler {

    protected ProductService service;

    public abstract String handleRequest (HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, NoSuchAlgorithmException, DomainException;

    public void setModel (ProductService ProductService) {
        this.service = ProductService;
    }

    public ProductService getService() {
        return service;
    }


}
