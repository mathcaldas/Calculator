package br.ifes.projetosistemas.calculator.dto;

public class RequestDTO {
    private String option;
    private float firstValue;
    private float secondValue;

    public RequestDTO(String option, float firstValue, float secondValue) {
        this.option = option;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {this.option = option;}

    public float getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(float firstValue) {
        this.firstValue = firstValue;
    }

    public float getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(float secondValue) {this.secondValue = secondValue;}
}
