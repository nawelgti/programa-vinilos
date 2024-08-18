import java.util.Scanner;

//principal (menu)
public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        System.out.println("Bienvenido");

        while (continuar) {
            System.out.println();
            System.out.println("1. Invertir orden de una cadena");
            System.out.println("2. Sumar números pares de un arreglo de enteros");
            System.out.println("3. Calcular promedio de notas");
            System.out.println("4. Salir");
            System.out.print("Elija una opción ingresando el número: ");
            int respMenu = leerInt();
            switch (respMenu) {
                case 1: {
                    System.out.println();
                    String invertida = inventirCadena();
                    System.out.println(invertida);
                    break;
                }
                case 2: {
                    System.out.println();
                    int suma = sumarPares();
                    System.out.println("El total de la suma de n° pares es: " + suma);
                    break;
                }
                case 3: {
                    System.out.println();
                    int promedio = calcularPromedio();
                    if (promedio >= 40) {
                        System.out.println("El promedio es: " + promedio);
                        System.out.println("¡Felicitaciones, aprobaste!");
                        break;
                    } else if (promedio < 36) {
                        System.out.println("El promedio es: " + promedio);
                        System.out.println("Lo siento, reprobaste.");
                        break;
                    } else {
                        System.out.println("El promedio es: " + promedio);
                        System.out.println("Vas a examen.");
                        break;
                    }
                }
                case 4: {
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("Ingrese una opción valida");

                }
            }
        }
    }

    //1.1 invertir cadenas
    public static String inventirCadena() {
        System.out.println("Ingrese una frase o palabra: ");
        String respuesta = leerRespuesta();

        StringBuilder creador = new StringBuilder(respuesta);


        return creador.reverse().toString();
    }

    //1.2 sumar pares de un arreglo
    public static int sumarPares() {
        System.out.println("Cantidad de numeros a ingresar: ");
        int respuesta = leerInt();
        int[] numeros = new int[respuesta];
        for (int i = 0; i < respuesta; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = leerInt();
        }

        int suma = 0;
        for (int numero:  numeros) {
            if (numero % 2 == 0) {
                suma += numero;
            }
        }
        return (suma);
    }

    //2. calcular promedio de notas
    public static int calcularPromedio() {
        int sumaNotas = 0;
        System.out.println("Cantidad de notas a promediar: ");
        int cantidadNotas = leerInt();
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingrese una nota: ");
            int nota = leerInt();

            sumaNotas = sumaNotas + nota;
        }
        return sumaNotas / cantidadNotas;
    }

    //inputs
    public static String leerRespuesta() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int leerInt() {
        Scanner inp = new Scanner(System.in);
        return inp.nextInt();
    }
}