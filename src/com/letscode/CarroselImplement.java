package com.letscode;

public class CarroselImplement implements Brinquedo{
    @Override
    public boolean acessoBrinquedo(int idade, double altura) {
        if (idade > 6 && altura > 1.30){
            System.out.println("Pode andar no Carrossel!");
            return true;
        }
        else {
            System.out.println("Acesso proibido!");
            return false;
        }
    }
}
