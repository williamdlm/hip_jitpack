package com.github.williamdlm.config;

import com.github.williamdlm.service.GreetingService;
import org.apache.camel.BeanInject;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;

public class CxfConfig {
    @BeanInject
    public CxfEndpoint greetingEndpoint() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8080/greeting");
        cxfEndpoint.setServiceClass(GreetingService.class);
        return cxfEndpoint;
    }
}
