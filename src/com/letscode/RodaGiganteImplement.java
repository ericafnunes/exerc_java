package com.letscode;

public class RodaGiganteImplement implements Brinquedo{
    @Override
    public boolean acessoBrinquedo(int idade, double altura) {
        System.out.println("Pode andar na roda gigante!");
        return true;
    }
}
