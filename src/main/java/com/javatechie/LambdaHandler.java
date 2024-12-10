package com.javatechie;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.Map;

public class LambdaHandler implements RequestHandler<Map<String, String>, String> {
  
    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        context.getLogger().log("Lambda function is invoked with event: " + event);
        String name = event.get("name");
        if (name == null || name.isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }
}
