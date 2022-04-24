package com.letscode;

public class MontanhaRussaImplement implements Brinquedo{
    @Override
    public boolean acessoBrinquedo(int idade, double altura) {
        if (idade>16 && altura>1.55){
            System.out.println("Pode andar na montanha russa!");
            return true;
        }
        else {
            System.out.println("Acesso proibido!");
            return false;
        }
    }
}