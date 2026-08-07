# CRON
Es un servicio en Linux.

> `cron` es un planificador de tareas.

Permite ejecutar comandos automáticamente en ciertos horarios.

Ejemplo:
  * Ejecutar un backup todos los días a las 2:00 AM
  * Borrar logs cada domingo
  * Lanzar un script cada 5 minutos

## Conceptos
### ¿Qué es un cronjob?
Un **cronjob** es simplemente una línea que dice:

> "Ejecuta este comando en este momento"

Se guarda en algo llamado **crontab** (cron table).

### ¿Cómo ver tu crontab?
```bash
crontab -l
```
Si no tienes nada, dirá que está vacío

Para editarlo:
```bash
crontab -e

```

### Estructura de un cronjob
```bash
* * * * * comando
│ │ │ │ │
│ │ │ │ └── Día de la semana (0-7)
│ │ │ └──── Mes
│ │ └────── Día del mes
│ └──────── Hora
└────────── Minuto
```
Ejemplo:
```bash
* * * * * echo "hola"
```
Significa: Ejecutar cada minuto

Otro ejemplo:
```bash
0 2 * * * /home/user/backup.sh 
```
Significa: Ejecutar a las 2:00 AM todos los días.

### Valores especiales
| Símbolo | Significado |
| ------- | ----------- |
| `*`     | Todo        |
| `*/5`   | Cada 5      |
| `1,2,3` | Lista       |
| `1-5`   | Rango       |


## Formas de usar
### Asterisco `*`
Significa "cualquier valor".

Ejemplo:
```bash
* * * * * *
```
> Ejecuta **cada minuto**.

Otro ejemplo:
```bash
0 * * * *
```
> Ejecuta **cada hora en el minuto 0**

### Números
Indican un valor específico.
```bash
30 14 * * *
```
> Ejecuta a las 14:30 todos los días

### Rangos `-`
Permite definir **intervalos**.
```bash
0 9-17 * * *
```
> Ejecuta cada hora entre 9:00 y 17:00

### Lista `,`
Permite **varios valores específicos**
```bash
0 9,12,18 * * *
```
> Ejecuta a las 9:00, 12:00 y 18:00

### Incrementos `*/n` (progresivo)
Significa **cada n unidades**
```bash
*/5 * * * *
```
> Cada 5 minutos

```bash
0 */2 * * *
```
> Cada 2 horas

También puede combinarse
```bash
0 9-18/3 * * *
```
> Cada 3 horas entre 9 y 18

### Último día `L`
El símbolo `L` = Last (último)
```bash
0 0 L * *
```
> Ejecuta el último día de cada mes a las 00:00





