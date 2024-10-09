package br.ifes.projetosistemas.calculator.view;

import br.ifes.projetosistemas.calculator.dto.RequestDTO;
import br.ifes.projetosistemas.calculator.dto.ResponseDTO;

import java.util.Scanner;

public class Menu {
    public RequestDTO show(){
        this.showMenu();
        return this.captureValues();
    }

    private void showMenu(){
        System.out.println("""
                ---> Hello <---
                Choose one option:
                Addition
                Subtraction
                Multiplication
                Division
                Leave ...
                """);
    }

    private RequestDTO captureValues(){
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        System.out.println("Enter the first value: ");
        float firstValue = input.nextFloat();
        System.out.println("Enter the second value: ");
        float secondValue = input.nextFloat();

        return new RequestDTO(option, firstValue, secondValue);
    }

    public void showResult(ResponseDTO responseDTO){
        System.out.println("The result is: " + responseDTO.getResult());
    }
}
