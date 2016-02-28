package com.example.georgebentes.utla.util;

/**
 * Created by George Bentes on 07/02/2016.
 */
public class UtlaUtils {

    public static String nomeUsuario = "";
    public static final String URL_SERVIDOR_API = "http://localhost:3000/utla-api-v1/";

    public static String capitalizar(String str){
        char myChar = str.charAt(0);
        String strAux = new String(String.valueOf(myChar));
        strAux = strAux.toUpperCase();
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.deleteCharAt(0);
        strBuilder.insert(0, strAux);
        str = strBuilder.toString();
        return str;
    }

    public static String pegarVogais(String str){
        String vogais = "";
        String vetVogais = "a e i o u";

        for (int i = 0; i < str.length(); i++)
        {
            if(vetVogais.contains(String.valueOf(str.charAt(i))))
            {
                vogais += String.valueOf(str.charAt(i));
            }
        }
        return vogais;
    }

    public static String pegarConsoantes(String str){
        String consoantes = "";
        String vetVogais = "a e i o u";

        for (int i = 0; i < str.length(); i++)
        {
            if(!vetVogais.contains(String.valueOf(str.charAt(i))))
            {
                consoantes += String.valueOf(str.charAt(i));
            }
        }
        return consoantes;
    }

    public static String gerarNomeUsuarioAleatorio()
    {
        char[] vogais = pegarVogais(nomeUsuario).toCharArray();
        char[] consoantes = pegarConsoantes(nomeUsuario).toCharArray();
        nomeUsuario = "";
        for(int i = 0; i < consoantes.length; i++)
        {
            nomeUsuario += consoantes[i];
            if(i < vogais.length){
                nomeUsuario += vogais[i];
            }
        }

        StringBuilder strBuilder = new StringBuilder(nomeUsuario);
        strBuilder.reverse();
        nomeUsuario = strBuilder.toString();
        nomeUsuario = nomeUsuario.toLowerCase();
        return nomeUsuario;
    }
}
