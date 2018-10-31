package com.academy.telesens.lesson11;

import java.math.BigDecimal;

public interface ArithmeticOperations {
    BigDecimal div(BigDecimal x1, BigDecimal x2) throws DivisionByZero;
}
