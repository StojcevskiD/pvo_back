package com.example.findmin;

public class CalculationDto {
    public Integer minimum;
    public Integer line;

    public CalculationDto() {
    }

    public CalculationDto(Integer minimum, Integer line) {
        this.minimum = minimum;
        this.line = line;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public void setLine(Integer line) {
        this.line = line;
    }
}
