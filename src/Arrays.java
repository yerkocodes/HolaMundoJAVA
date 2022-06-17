public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        // Array de 2 dimensiones
        String[][] cities = new String[4][2]; // 4 filas y 2 columnas
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

        // Array de 3 dimensiones
        int[][][] numbers = new int[2][2][2];

        // Array de 4 dimensiones
        int [][][][] numbers4 = new int[2][2][2][2];

        // Agregar elementos a androidVersions
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        //for (int i = 0; i < androidVersions.length; i++) {
        //    if (androidVersions[i] != null) {
        //        System.out.println(androidVersions[i]);
        //    }
        //}

        // FOREACH
        for (String androidVersion : androidVersions) {
            if (androidVersion != null) {
                System.out.println(androidVersion);
            }
        }

//        System.out.println(androidVersions[0]);
//        System.out.println(androidVersions[1]);
//        System.out.println(androidVersions[2]);
//        System.out.println(androidVersions[3]);

        // Agregando elementos a cities
        // cities[fila][columna]
        cities[0][0] = "Colombia";
        cities[1][0] = "Colombia";
        cities[2][0] = "Mexico";
        cities[3][0] = "Mexico";

        cities[0][1] = "Medellin";
        cities[1][1] = "Bogota";
        cities[2][1] = "Guadalajara";
        cities[3][1] = "CDMX";

//        for (int i = 0; i < cities.length; i++) { // filas
//            for (int j = 0; j < cities[i].length; j++) { // columnas
//                System.out.println(cities[i][j]);
//            }
//        }

        // FOREACH
        for (String[] country: cities) {
            for (String city : country) {
                System.out.println(city);
            }
        }
        System.out.println();
        System.out.println(java.util.Arrays.deepToString(cities));

//        System.out.println(cities[0][0]);
//        System.out.println(cities[1][0]);
//        System.out.println(cities[2][0]);
//        System.out.println(cities[3][0]);
//
//        System.out.println(cities[0][1]);
//        System.out.println(cities[1][1]);
//        System.out.println(cities[2][1]);
//        System.out.println(cities[3][1]);

        System.out.println("");

        // Busca al chango
        System.out.println("Busca el changuito");
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Changuito";

//        for (int i = 0; i < animals.length; i++) {
//            for (int j = 0; j < animals[i].length; j++) {
//                for (int k = 0; k < animals[i][j].length; k++) {
//                    for (int l = 0; l < animals[i][j][k].length; l++) {
//                        if (animals[i][j][k][l] != null) {
//                            System.out.println(animals[i][j][k][l]);
//                        }
//                    }
//                }
//            }
//        }

        // FOREACH
        for (String[][][] fila: animals) {
//            System.out.println(java.util.Arrays.deepToString(fila));
            for (String[][] fila2: fila) {
//                System.out.println(java.util.Arrays.deepToString(fila2));
                for (String[] fila3 : fila2) {
//                    System.out.println(java.util.Arrays.toString(fila3));
                    for (String fila4 : fila3) {
                        if (fila4 != null) {
                            System.out.println("Encontrado: " + fila4);
                        }
                    }
                }
            }
        }

    }
}
