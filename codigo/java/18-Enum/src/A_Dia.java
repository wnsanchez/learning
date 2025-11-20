/*
ENUM
Es un tipo especial que representa un conjunto fijo y limitado de valores constantes.
Ejemplo: Días de la semana | colores | niveles de prioridad | estados | etc.
Ventajas:
    * Evitar usar strings sueltos o números mágicos
    * Es type-safe (no permite valores inválidos)
    * Se compara fácilmente
    * Se integra bien con switch
*/
public enum A_Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
