public class B_Uso {
    public static void main(String[] args) {
        A_Dia dia = A_Dia.VIERNES;

        switch (dia) {
            case LUNES -> System.out.println("Inicio de semana");
            case VIERNES -> System.out.println("Casi fin");
            case SABADO, DOMINGO -> System.out.println("Fin de semana");
            default -> System.out.println("Día normal");
        }

        A_Dia[] dias = A_Dia.values(); // Lista todos los valores

        System.out.println(dias[1]);

        int pos = A_Dia.LUNES.ordinal(); // Posición
        System.out.println(pos);

        A_Dia d = A_Dia.valueOf("MARTES");

    }

}
