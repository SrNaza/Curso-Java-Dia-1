package curso.main;

/**
 *
 * @author laboratorio
 */
public class clase {

 private int contador;
    
    public static void main(String[] args) {
       
        clase obj = new clase();
               
        for (obj.contador= 0; obj.contador < 10; obj.contador++) {
            System.out.println("Imprimiendo el contador "+obj.contador);
        }
    }
}
