package br.ifes.projetosistemas.calculator.models.factory;

import br.ifes.projetosistemas.calculator.dto.RequestDTO;
import br.ifes.projetosistemas.calculator.models.operation.IOperation;

import java.lang.reflect.InvocationTargetException;

public class FactoryOparation {
    public static IOperation OperationCreate(RequestDTO requestDTO) {
        try {
            Class<?> operation = Class.forName("br.ifes.projetosistemas.calculator.models.operation." + requestDTO.getOption());
            return (IOperation) operation.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            System.out.println(" Erro ");
        }
        return null;
    }
}
