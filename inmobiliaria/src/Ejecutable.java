import java.util.Scanner;
public class Ejecutable {
    public static void main (String[]args) {
        Inmobiliaria prod1 = new Inmobiliaria(, "", , , "");
        System.out.println(prod1.toString());
        Inmobiliaria prod2 = new Inmobiliaria()
        System.out.println(prod1.toString());
        Scanner scnNro = new Scanner(System.in);
        Scanner scnCod = new Scanner(System.in);
        System.out.println("ingrese el codigo del producto");
        int cod = scnNro.nextInt();
        System.out.println("ingrese la ubicacion de la propiedad");
        String ubicacion = scnCod.nextLine();
        System.out.println("ingrese el precio del producto");
        int precio = scnNro.nextInt();
        System.out.println("ingrese el codigo postal del producto");
        int codpost = scnNro.nextInt();
        System.out.println("ingrese la ciudad donde se ubica la vivienda");
        int ciudad= scnNro.nextInt();
    }
}