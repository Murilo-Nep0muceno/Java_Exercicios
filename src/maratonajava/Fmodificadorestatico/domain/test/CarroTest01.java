package maratonajava.Fmodificadorestatico.domain.test;

import maratonajava.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BWM", 290);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 300);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
