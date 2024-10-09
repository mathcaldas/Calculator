package br.ifes.projetosistemas.calculator.models.operation;

public class Subtraction implements IOperation {
    @Override
    public float calc(float firstValue, float secondValue){
        return firstValue-secondValue;
    }
}