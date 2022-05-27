public class MathematicOperations {
    public static void main(String[] args) {
        double a = 2.1;
        double b = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(a));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(a));

        //Devuelve un numero elevado a otro
        System.out.println(Math.pow(a, b));

        //Devuelve el numero mayor
        System.out.println(Math.max(a, b));

        //Devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(a));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(b, 2));

        //Area de una esfera
        //4 * PI * r2
        System.out.println(4 * Math.PI * Math.pow(b, 2));

        //Volumen de una esfera
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(b, 3));
    }
}
