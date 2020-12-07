package controller;

import domain.service.ProductService;

public class HandlerFactory {

    public RequestHandler getHandler(String handlerName, ProductService model) {
        RequestHandler handler = null;
        try {
            Class handlerClass = Class.forName("controller."+ handlerName);
            Object handlerObject = handlerClass.newInstance();
            handler = (RequestHandler) handlerObject;
            handler.setModel(model);
        } catch (Exception e) {
            throw new RuntimeException("Deze pagina bestaat niet!");
        }

        return handler;
    }
}
