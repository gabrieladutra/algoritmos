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
        lista.add(4);
        lista.add(1);
        lista.add(9);
        lista.add(10);

        System.out.println(procuraPrimeiroValorDuplicado(lista));
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

}
