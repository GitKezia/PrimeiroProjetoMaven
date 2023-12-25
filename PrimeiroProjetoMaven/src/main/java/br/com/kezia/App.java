package br.com.kezia;


import java.util.Collections;

public class App {
    public static void main(String[] args) {
        String texto = "Olá, mundo!";
        StringBuilder StringUtils = new StringBuilder();
        String textoInvertido = String.valueOf(StringUtils.reverse());

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }
}
