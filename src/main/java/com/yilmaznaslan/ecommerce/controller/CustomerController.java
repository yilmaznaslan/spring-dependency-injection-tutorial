package com.yilmaznaslan.ecommerce.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.yilmaznaslan.ecommerce.model.Customer;
import com.yilmaznaslan.ecommerce.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;

public class CustomerController implements HttpHandler {

    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        logger.info("Handling request");
        String id = httpExchange.getRequestURI().getPath().split("/")[2];

        Customer customer = customerService.getCustomerById(id);

        // Convert the customer object to JSON. In a real application, use a library like Jackson or Gson.
        String response = "{ \"id\": \"" + customer.getId() + "\", \"name\": \"" + customer.getName() + "\" }";

        httpExchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
