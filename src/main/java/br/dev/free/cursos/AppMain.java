package br.dev.free.cursos;

import org.apache.commons.io.FileUtils;

import java.io.*;

/**
 * Descrição
 * Uma calculadora que suporta emtradas como:
 * 1
 * 1 + 5
 * 10 - 7 + 4
 * 24 + 1 - 2 / 4
 * 95 * 2 - 1 + 5 / 3
 * e retorna o resultado se a entrada for valida, ou mensagem Entrada invalida.
 *
 * Tambem tera que gravar todas as operações feitas num arquivo historico.txt
 */
public class AppMain {

    public static final String ARQUIVO_HISTORICO = "historico.txt";

    public static void gravarHistorico(String msg) {
        try {
            FileUtils.writeStringToFile(new File(ARQUIVO_HISTORICO), msg, "UTF-8", true);
            System.out.println(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {

        // Criar a calculadora e calcular o resultado
        Calculadora calculadora = new Calculadora(args);

        if (!calculadora.verificar()) {
            gravarHistorico("Entrada invalida");
            return;
        }

        calculadora.calcular();

        gravarHistorico("Resultado: " + calculadora.getResultado());

    }

}