package com.kodilla.events.domain;

import java.math.BigDecimal;

public class WebCalculatorDto {
    private BigDecimal varA;
    private BigDecimal varB;

    public WebCalculatorDto(BigDecimal varA, BigDecimal varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BigDecimal getVarA() {
        return varA;
    }

    public void setVarA(BigDecimal varA) {
        this.varA = varA;
    }

    public BigDecimal getVarB() {
        return varB;
    }

    public void setVarB(BigDecimal varB) {
        this.varB = varB;
    }
}
