public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r2
        double area = circleArea(y);
        System.out.println(circleArea(y));

        //Area de una esfera
        //4 * PI * r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        // (4/3) * PI * r3
        System.out.println(sphereVolumen(y));

        System.out.println("Convertidor de pesos a dolar: " + convertToDolar(1000.0, "MXN"));
    }

    public static double circleArea(double ratio) {
        return Math.PI * Math.pow(ratio, 2);
    }

    public static double sphereArea(double ratio) {
        return 4 * Math.PI * Math.pow(ratio, 2);
    }

    public static double sphereVolumen(double ratio) {
        return (4/3) * Math.PI * Math.pow(ratio, 3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param money Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDolar(double quantity, String money) {
        switch (money) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
