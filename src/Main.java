//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Votacion votacion = new Votacion();
         Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("1.Votar");
            System.out.println("2.Calcular el costo de la campaña");
            System.out.println("3.Vaciar urnas");
            System.out.println("4.Saber los resultados");
            System.out.println("5.Salir");

            System.out.println("Ingrese su opcion");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Seleccione un candidato:");
                    for(int i=0; i< votacion.candidatoes.size(); i++){
                        System.out.println((i+1) + "." + votacion.candidatoes.get(i).getNombre());
                    }
                    int candidatoSeleccionado = scanner.nextInt()  - 1;
                    System.out.println("Seleccione el medio de influencia:");
                    System.out.println("1.Internet");
                    System.out.println("2.Radio");
                    System.out.println("3.Television");
                    int medioSeleccionado = scanner.nextInt();
                    votacion.votar(candidatoSeleccionado, medioSeleccionado);
                    break;
                case 2:
                    votacion.calcularCostoCampana();
                    break;
                case 3:
                    votacion.vaciarUrnas();
                    break;
                case 4:
                    votacion.saberResultados();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}