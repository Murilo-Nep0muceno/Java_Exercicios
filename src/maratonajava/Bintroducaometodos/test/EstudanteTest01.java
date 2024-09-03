package maratonajava.Bintroducaometodos.test;

import maratonajava.Bintroducaometodos.dominio.Estudante;
import maratonajava.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Saitama";
        estudante01.idade = 26;
        estudante01.sexo = "Macho";

        estudante02.nome = "Hinata";
        estudante02.idade = 26;
        estudante02.sexo = "Woman";

        impressora.imprime(estudante01);

        impressora.imprime((estudante02));




    }
}
