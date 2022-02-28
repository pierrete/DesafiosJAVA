package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
   /*     int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }


}
class Livro {
    private String nome;
    private Integer npag;
    //constructor
    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }
    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //ToString

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}

