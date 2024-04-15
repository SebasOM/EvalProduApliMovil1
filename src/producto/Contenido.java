package producto;
import java.util.Scanner;
import java.util.Objects;
public class Contenido {
    static Scanner lea = new Scanner(System.in);
    static int i;
    static String ID;
    static String nombre;
    static String apellido;
    static String correo;
    static String clave;
    static String ID2;
    static String nombre2;
    static String apellido2;
    static String correo2;
    static String clave2;
    static String[][]usuarios = new String[2][5];

    static String op;
    static int op2;

    public static void main(String[] args) {

        login();
        visualizar();
        inicio();
    }

    public static void login(){


        System.out.println("Bienvenido");
        i =0;

        while(i<usuarios.length){
            String[] datosUsuario = new String[5];

            System.out.println("Ingrese Su ID");
            ID = lea.next();
            datosUsuario[0] = ID;

            System.out.println("Ingrese su nombre");
            nombre = lea.next();
            datosUsuario[1] = nombre;

            System.out.println("Ingrese su apellido");
            apellido = lea.next();
            datosUsuario[2] = apellido;

            System.out.println("Ingrese su correo");
            correo = lea.next();
            datosUsuario[3] = correo;

            System.out.println("Ingrese su clave");
            clave = lea.next();
            datosUsuario[4] = clave;
            usuarios[i]=datosUsuario;
            i++;

        }

    }
    public static void inicio() {
        System.out.println("Se ha registrado correctamente ¿desea iniciar sesion?(SI/NO)");
        op = lea.next();

        if ((Objects.equals(op, "Si")) || (Objects.equals(op, "si"))) {

            System.out.println("Ingrese su ID");
            ID2 = lea.next();

            System.out.println("Ingrese su nombre");
            nombre2 = lea.next();

            System.out.println("Ingrese apellido");
            apellido2 = lea.next();

            System.out.println("Ingrese correo");
            correo2 = lea.next();

            System.out.println("Ingrese la clave");
            clave2 = lea.next();

            if(Objects.equals(ID, ID2) && Objects.equals(nombre, nombre2)
                    && Objects.equals(apellido, apellido2) &&
                    Objects.equals(correo,correo2) &&Objects.equals(clave, clave2)){

                while(op2!=3) {
                    System.out.println("Elija una opcion");
                    System.out.println("1.Validar categoria\n2.Valoracion\n3.Cerrar");
                    op2 = lea.nextInt();

                    switch (op2) {

                        case 1 ->{
                            System.out.println("\nSe encuentra afiliado?(true/false)");
                            boolean afiliado = lea.nextBoolean();

                            System.out.println("\nDigite su salario mensual");
                            double salario = lea.nextDouble();

                            double salarioMinimo = 1300000;

                            if ((salario < salarioMinimo && salario < 2 * salarioMinimo) && afiliado == true) {
                                System.out.println("\nCategoria A");
                            } else if ((salario > 2 * salarioMinimo && salario < 3.5 * salarioMinimo) && afiliado == true) {
                                System.out.println("\nCategoria B");

                            } else if ((salario > 3.5 * salarioMinimo) && afiliado == true) {
                                System.out.println("\nCategoria C");
                            } else {
                                System.out.println("\nCategoria D");
                            }
                            break;
                        }
                        case 2 ->{
                            System.out.println("Muchas gracias por usar nuestro programa");

                            break;
                        }

                    }
                }

            }
        }

    }
    public static void visualizar () {
        for (int i = 0; i < usuarios.length; i++) {
            for (int j = 0; j < usuarios[i].length; j++) {
                System.out.println(usuarios[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
