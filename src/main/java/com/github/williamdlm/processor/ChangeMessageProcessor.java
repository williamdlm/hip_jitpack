package com.github.williamdlm.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ChangeMessageProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody("Altered exchange: " + exchange.getIn().getBody());
    }
}
