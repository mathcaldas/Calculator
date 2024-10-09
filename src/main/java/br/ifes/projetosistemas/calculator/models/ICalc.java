package br.ifes.projetosistemas.calculator.models;

import br.ifes.projetosistemas.calculator.models.operation.IOperation;

public interface ICalc {
    public float calculation(IOperation operation, float firstValue, float secondValue);
}
