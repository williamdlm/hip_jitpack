package com.github.williamdlm;

import com.github.williamdlm.config.CxfConfig;
import com.github.williamdlm.routes.CxfRoute;
import com.github.williamdlm.service.GreetingServiceImpl;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        try (CamelContext camel = new DefaultCamelContext()) {
            CxfConfig cxfConfig = new CxfConfig();
            camel.getRegistry().bind("greetingEndpoint", cxfConfig.greetingEndpoint());
            camel.getRegistry().bind("greetingServiceImpl", GreetingServiceImpl.class);
            camel.addRoutes(CxfRoute.createRoute());
            camel.start();
            while (true){

            }
        }
    }
}
