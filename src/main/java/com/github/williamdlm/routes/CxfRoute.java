package com.github.williamdlm.routes;

import org.apache.camel.builder.RouteBuilder;

public class CxfRoute {
    public static RouteBuilder createRoute() {

        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("cxf:bean:greetingEndpoint")
                        .log("{$body}")
                        .to("bean:greetingServiceImpl?method=sayHi");
            }
        };
    }
}
