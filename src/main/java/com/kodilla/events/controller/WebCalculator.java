package com.kodilla.events.controller;

import com.kodilla.events.domain.WebCalculatorDto;
import com.kodilla.events.event.WebCalculationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
import java.math.BigDecimal;

@RestController
@RequestMapping("/v1/webCalculator")
public class WebCalculator extends RequestMappingHandlerMapping implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @PostMapping("add")
    public BigDecimal add(@RequestBody WebCalculatorDto webCalculatorDto) {
        BigDecimal result = webCalculatorDto.getVarA().add(webCalculatorDto.getVarB());
        applicationEventPublisher.publishEvent(new WebCalculationEvent(this, "add", webCalculatorDto.getVarA(),
                webCalculatorDto.getVarB(), result));
        return result;
    }

    @PostMapping("substract")
    public BigDecimal substract(@RequestBody WebCalculatorDto webCalculatorDto) {
        BigDecimal result = webCalculatorDto.getVarA().subtract(webCalculatorDto.getVarB());
        applicationEventPublisher.publishEvent(new WebCalculationEvent(this, "substract", webCalculatorDto.getVarA(),
                webCalculatorDto.getVarB(), result));
        return result;
    }

    @PostMapping("multiply")
    public BigDecimal multiply(@RequestBody WebCalculatorDto webCalculatorDto) {
        BigDecimal result = webCalculatorDto.getVarA().multiply(webCalculatorDto.getVarB());
        applicationEventPublisher.publishEvent(new WebCalculationEvent(this, "multiply", webCalculatorDto.getVarA(),
                webCalculatorDto.getVarB(), result));
        return result;
    }

    @PostMapping("divide")
    public BigDecimal divide(@RequestBody WebCalculatorDto webCalculatorDto) {
        BigDecimal result = webCalculatorDto.getVarA().divide(webCalculatorDto.getVarB());
        applicationEventPublisher.publishEvent(new WebCalculationEvent(this, "divide", webCalculatorDto.getVarA(),
                webCalculatorDto.getVarB(), result));
        return result;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
