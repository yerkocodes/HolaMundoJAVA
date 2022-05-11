public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

//        bono = $200
        salary = salary + 200;
        System.out.println(salary);

//        pension $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida: $45
        salary = salary + (30 * 2) - 45;
        System.out.println(salary);

        //Concatenacion de string
        String employeement = "Andres Cortes";
        System.out.println(employeement);

        employeement = employeement + " Baeza";
        System.out.println(employeement);

        employeement = "Yerko " + employeement;
        System.out.println(employeement);
    }
}
