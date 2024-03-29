package com.svetlanafedorova.apachecamelb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file: files/input")
                .log("File moved")
                .to("file: files/output");
    }
}
