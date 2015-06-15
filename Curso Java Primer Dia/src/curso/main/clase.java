package curso.main;

import nuevoPaquete.ClaseDos;

/**
 *
 * @author laboratorio
 */
public class clase {

    private int contador;

    public static void main(String[] args) {

        clase obj = new clase();

        for (obj.contador = 0; obj.contador < 10; obj.contador++) {
            System.out.println("Imprimiendo el contador " + obj.contador);
        }

        ClaseDos cd1 = new ClaseDos();
        System.out.println("atributos claseDos " + cd1.otraCosa);
        ClaseTres ct1 = new ClaseTres();
        System.out.println("atributos clasTres " + ct1.prot);
    }
}
