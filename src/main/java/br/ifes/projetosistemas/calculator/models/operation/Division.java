package br.ifes.projetosistemas.calculator.models.operation;

public class Division implements IOperation{
    @Override
    public float calc(float firstValue, float secondValue){
        if (secondValue == 0)  throw new ArithmeticException("Division by zero");
        return firstValue/secondValue;
    }
}
