package br.ifes.projetosistemas.calculator.dto;

public class ResponseDTO {
    private float result = 0;

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public ResponseDTO(float result) {
        this.result = result;
    }
}
