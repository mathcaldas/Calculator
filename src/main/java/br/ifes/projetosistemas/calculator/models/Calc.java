package br.ifes.projetosistemas.calculator.models;

import br.ifes.projetosistemas.calculator.models.operation.IOperation;

public class Calc implements ICalc {
    public float calculation(IOperation operation, float firstValue, float secondValue){
        return operation.calc(firstValue,secondValue);
    }
}
