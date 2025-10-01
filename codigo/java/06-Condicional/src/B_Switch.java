/*
SWITCH
- Se utiliza para ejecutar diferentes bloques de código dependiendo del valor de una variable o expresión.

*/
public class B_Switch {
    public static void main(String[] args) {
        //Variables
        var opcion = 3;

        System.out.println("____________________________________________________");
        System.out.println(" **** SWITCH ****");

        var caseSwitch = """
                switch (opcion) {
                            case 1:
                                System.out.println("Caso 1");
                                break; // Break rompe el proceso
                            case 2:
                                System.out.println("Caso 2");
                                break;
                            case 3:
                                System.out.println("Caso 3");
                                break;
                            default:
                                System.out.println("Caso no ubicado");
                        }
                """;
        System.out.println(caseSwitch);
        System.out.print("Resultado: ");
        switch (opcion) {
            case 1:
                System.out.println("Caso 1");
                break; // Break rompe el proceso
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Caso no ubicado");
        }

    }
}
