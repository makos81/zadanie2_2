package com.kodilla.events.event;

import org.springframework.context.ApplicationEvent;

import java.math.BigDecimal;

public class WebCalculationEvent extends ApplicationEvent {
    BigDecimal varA;
    BigDecimal varB;
    String operation;
    BigDecimal result;

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public WebCalculationEvent(Object source, String operation, BigDecimal varA, BigDecimal varB, BigDecimal result) {
        super(source);
        this.operation  = operation;
        this.varA = varA;
        this.varB = varB;
        this.result = result;
    }

    public BigDecimal getVarA() {
        return varA;
    }

    public BigDecimal getVarB() {
        return varB;
    }
}
