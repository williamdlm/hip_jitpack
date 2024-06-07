package com.github.williamdlm;

import com.github.williamdlm.config.CxfConfig;
import com.github.williamdlm.routes.CxfRoute;
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
            camel.addRoutes(CxfRoute.createRoute());
            camel.start();
            Thread.sleep(100_000);
        }
    }
}
