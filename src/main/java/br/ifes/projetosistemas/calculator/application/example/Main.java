package br.ifes.projetosistemas.calculator.application.example;

import br.ifes.projetosistemas.calculator.controller.ControllerCalc;
import br.ifes.projetosistemas.calculator.dto.RequestDTO;
import br.ifes.projetosistemas.calculator.dto.ResponseDTO;
import br.ifes.projetosistemas.calculator.view.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        RequestDTO requestDTO = menu.show();
        ControllerCalc controllerCalc = new ControllerCalc();
        ResponseDTO responseDTO = controllerCalc.calc(requestDTO);
        menu.showResult(responseDTO);
    }
}