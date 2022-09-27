
package pilas_colas;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        pilas pila = new pilas();
        int op = 0;
        
        while (op !=4){
            op = leerEntero("menu\n1 agregar \n"
                    + "2. mostrar pila \n"
                    + "3. sacar \n"
                    + "4. salir");
            switch (op) {
                case 1:
                    int num = leerEntero("digite el numero ");
                    pila.addini(num);
                    break;
                    
                case 2:
                    pila.mostrarpila();
                    break;
                    
                case 3:
                    pila.sacar();
                    break;
                case 4:
                    Mostrar("fin del programa");
                    break;
                    
                default: 
                    Mostrar("opcion no valida");
                    break;
            }
        }
    }
    
    static String leerString(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    static int leerEntero(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    static void Mostrar(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
}
