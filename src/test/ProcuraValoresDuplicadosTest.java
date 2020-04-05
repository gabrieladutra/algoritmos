package test;

import main.Main;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class MainTest {
    @Test
    public void procuraValorDuplicado_quandoValorForDuplicado_deveRetornarDuplicado() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        Integer resultado = 1;
        assertEquals(resultado, Main.procuraValorDuplicado(lista));
    }

    @Test
    public void procuraValorDuplicado_quandoValornaoForDuplicado_deveRetornar0() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(10);
        Integer resultado = 0;
        assertEquals(resultado, Main.procuraValorDuplicado(lista));
    }


    @Test
    public void procuraPrimeiroValorDuplicado_quandoValorForDuplicado_deveRetornarDuplicado() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        Integer resultado = 1;
        assertEquals(resultado, Main.procuraValorDuplicado(lista));
    }

    @Test
    public void procuraPrimeiroValorDuplicado_quandoValornaoForDuplicado_deveRetornar0() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(10);
        Integer resultado = 0;
        assertEquals(resultado, Main.procuraValorDuplicado(lista));
    }


}
