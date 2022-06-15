public class Arrays {
    public static void main(String[] args) {
        String [] androirVersions = new String[17];
        String days[] = new String[7];

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        // Asignacion de datos al arreglo de "androidVersions" mediante su posicion de indice.
        androirVersions[0] = "Apple Pie";
        androirVersions[1] = "Bannana Bread";
        androirVersions[2] = "Cupcake";
        androirVersions[3] = "Donut";

        System.out.println(androirVersions[0]);
        System.out.println(androirVersions[1]);
        System.out.println(androirVersions[2]);
        System.out.println(androirVersions[3]);

        System.out.println();
        System.out.println();

        String[][] cities = new String[4][2]; // Cuatro filas y dos columnas.
        /*
         * +---------------------------+
         * |  Country   |    Cities    |
         * -----------------------------
         * |   Mexico   |     CDMX     |
         * |   Mexico   | Guadalajara  |
         * |  Colombia  |    Bogota    |
         * |  Colombia  |   Medellin   |
         * +---------------------------+
         * */

      //cities[fila][columna] = "valor";
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);
    }
}
