package com.javatechie;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Object, String> {
    public String handleRequest(final Object input, final Context context) {
        System.out.println(input);
        return "Hello from Lambda!";
    }
}
