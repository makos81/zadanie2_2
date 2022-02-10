package com.kodilla.events.service;

import com.kodilla.events.event.WebCalculationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class WebCalculatorManager implements ApplicationListener<WebCalculationEvent> {
    Logger logger = LoggerFactory.getLogger(WebCalculatorManager.class);

    @Override
    public void onApplicationEvent(WebCalculationEvent event) {
        logger.info("event " + event.getOperation() + " valA: " + event.getVarA() + " valB: " + event.getVarB() + " result: " + event.getResult() + " method: " + event.toString());
    }
}
