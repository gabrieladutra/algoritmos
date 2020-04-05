package main;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(41);
        lista.add(1);
        lista.add(9);
        lista.add(10);

        System.out.println(procuraValorDuplicado(lista));
    }

    public static Integer procuraPrimeiroValorDuplicado(ArrayList<Integer> listaProcurarDuplicados) {
        ArrayList<Integer> numerosJaProcurados = new ArrayList<>();
        for (int i = 0; i < listaProcurarDuplicados.size(); i++) {
            Integer numeroAtual = listaProcurarDuplicados.get(i);
            if (numerosJaProcurados.contains(numeroAtual)) {
                return numeroAtual;
            }
            numerosJaProcurados.add(numeroAtual);
        }
        return 0;

    }


    public static Integer procuraValorDuplicado(ArrayList<Integer> listaProcurarDuplicados) {
        for (int i = 0; i < listaProcurarDuplicados.size(); i++) {
            Integer numeroAtual = listaProcurarDuplicados.get(i);
            for (int j = i + 1; j < listaProcurarDuplicados.size(); j++){
                Integer proximoNumero = listaProcurarDuplicados.get(j);

                if (numeroAtual.equals(proximoNumero)) {
                    return numeroAtual;
                }
            }


        }
        return 0;

    }


}
