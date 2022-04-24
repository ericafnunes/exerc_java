package com.letscode;

import java.util.function.BiPredicate;

public class Brinquedos {
    public static void main(String[] args) {
        // Com classes
        MontanhaRussaImplement montanhaRussa = new MontanhaRussaImplement();
        montanhaRussa.acessoBrinquedo(12, 1.50);

        CarroselImplement carroselImplement = new CarroselImplement();
        carroselImplement.acessoBrinquedo(8, 1.45);

        RodaGiganteImplement rodaGigante = new RodaGiganteImplement();
        rodaGigante.acessoBrinquedo(1, 1.20);


        // Com classes anonimas - Roda Gigante
        acessoRequisito(new Brinquedo() {
            @Override
            public boolean acessoBrinquedo(int idade, double altura) {
                System.out.println("Roda gigante liberada liberada!");
                return true;
            }
        });

        // Com lambdas - Roda Gigante
        acessoRequisito(((idade,altura) -> {
                System.out.println("Roda gigante liberada!");
                return true;
        }));


        // Com lambdas - Carrossel
        acessoRequisito(((idade,altura) -> {
            if(idade > 6 && altura > 1.30){
                System.out.println("Carrossel liberado!");
                return true;
            }
            else{
                return false;
            }
        }));


        // Com classe anonimas - Carrossel
        acessoRequisito(new Brinquedo() {
            @Override
            public boolean acessoBrinquedo(int idade, double altura) {
                if(idade > 6 && altura > 1.30){
                    System.out.println("Carrossel liberado!");
                    return true;
                }
                 else {
                    System.out.println("Acesso proibido ao Carrossel!");
                     return false;
                }
            }
        });

        // Com lambdas - montanha russa
        acessoRequisito(((idade,altura) -> {
            if(idade > 16 && altura > 1.55){
                System.out.println("Montanha Russa liberada!");
                return true;
            }
            else{
                return false;
            }
        }));

        // Com classe Anonimas - Montanhas Russa
        acessoRequisito(new Brinquedo(){
            @Override
            public boolean acessoBrinquedo(int idade, double altura) {
                if( idade > 16 && altura >1.55){
                    System.out.println("Montanha Russa liberada!");
                   return true;
                }
                else {
                    System.out.println("Acesso proibido a montanha russa!");
                    return false;
                }
            }
        });

        // Com BiPredicate - montanha Russa
        acessoMontanhaRussaPredicate((idade, altura) ->{
            if((int) idade > 16 && (double) altura > 1.55){
                System.out.println("Montanha Russa liberada!");
                return true;
            }
            System.out.println("Acesso proibido!");
            return false;
        });

        // Com BiPredicate - Carrossel
    acessoCarrosselPredicate((idade, altura) ->{
        if((int) idade > 6 && (double) altura > 1.30){
            System.out.println("Carrossel liberado!");
            return true;
        }
        System.out.println("Acesso proibido!");
        return false;
    });

        // Com BiPredicate - Roda gigante
        acessoRodaGigantePredicate((idade, altura) ->{
            System.out.println("Acesso liberado!!");
            return true;
        });
    }


     static void acessoCarrosselPredicate(BiPredicate acessoBrinquedo) {
         System.out.println("Acesso carrossel:");
         System.out.println(acessoBrinquedo.test(12, 1.67));
    }
    static void acessoMontanhaRussaPredicate(BiPredicate acessoBrinquedo) {
        System.out.println("Acesso montanha russa:");
        System.out.println(acessoBrinquedo.test(8, 1.45));
    }
    static void acessoRodaGigantePredicate(BiPredicate acessoBrinquedo) {
        System.out.println("Acesso Roda gigante:");
        System.out.println(acessoBrinquedo.test(0, 1.20));
    }

    static void acessoRequisito(Brinquedo brinquedo) {
        brinquedo.acessoBrinquedo(1,1.56);
    }
}



