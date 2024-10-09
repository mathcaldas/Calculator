package br.ifes.projetosistemas.calculator.controller;

import br.ifes.projetosistemas.calculator.dto.RequestDTO;
import br.ifes.projetosistemas.calculator.dto.ResponseDTO;
import br.ifes.projetosistemas.calculator.models.Calc;
import br.ifes.projetosistemas.calculator.models.ICalc;
import br.ifes.projetosistemas.calculator.models.factory.FactoryOparation;
import br.ifes.projetosistemas.calculator.models.operation.IOperation;

public class ControllerCalc {
    public ResponseDTO calc(RequestDTO requestDTO){
        float result = 0;
        ICalc calc = null;
        calc = new Calc();

        IOperation operation = FactoryOparation.OperationCreate(requestDTO);

        result = calc.calculation(operation,requestDTO.getFirstValue(),requestDTO.getSecondValue());
        return new ResponseDTO(result);
    }

}
