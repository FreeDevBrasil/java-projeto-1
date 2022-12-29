package br.dev.free.cursos;

public class Calculadora {

    private String[] entrada;
    private Float resultado = 0f;

    public Calculadora(String[] entrada) {
        this.entrada = entrada;
    }

    public boolean verificar() {

        // Todo Desafio 1: verifique se a entrada esta correta

        return true;
    }

    public void calcular() {

        // Todo Desafio 2: calcule o resultado

        // Dica: Pode iterar oeka lista:
        for (String s : entrada) {
            System.out.println(s);
        }

    }

    public Float getResultado() {
        return resultado;
    }
}
