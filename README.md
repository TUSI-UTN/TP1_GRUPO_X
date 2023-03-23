
# TP1_GRUPO_X

Se necesita realizar un software que permita gestionar la creación de entradas. Los
diferentes tipos de entradas posibles son: entradas de recitales, entradas de teatro,
entradas infantiles y entradas de deportes.

Todas las entradas poseen un número único de entrada, nombre del show, día y
horario del evento, tiempo aproximado de duración y costo. El costo se calcula de
manera diferente según el tipo de entrada.

Las entradas de los recitales tienen un costo de fijo 1500$ para entradas vip y 800$
para entradas generales. A su vez, cada entrada pertenece a una banda, tiene un
género en particular y puede tener una o dos bandas de soporte. Los géneros posibles
para los recitales son los siguientes: rock, heavy metal, reggaetón, trap, latinos y pop.

Las entradas para el teatro tienen un valor fijo de 1350,50$. A su vez, los teatros
tienen sus propios géneros y actores principales. Consideraremos que como máximo
se puede tener 3 actores principales. Los géneros de los teatros son los siguientes:
drama, teatro o comedia.

Las entradas de los eventos infantiles tienen un costo fijo de 250$ para menores de 8
años y para mayores de 8 años el costo será de 500$. A su vez, los eventos infantiles
pueden contener o no, un souvenir del evento.

Las entradas de los eventos de deportes tienen un valor fijo según el tipo de deporte,
el futbol tiene un valor fijo de 300$, el rugby tiene un valor fijo de 450$ y hockey
tiene un valor fijo de 380$. El deporte puede ser clasificado de manera nacional o
internacional. En el caso de que sea un deporte internacional, el valor de la entrada
será con un recargo de un 30%.

Se pide realizar el correcto diseño de clases y aplicar en el diseño los siguientes
conceptos




## Conceptos

 - Constructores
 - Encapsulamiento.
 - Método toString()
 - Variables constantes
 - Variables estáticas
 - Herencia
 - Crear al menos una clase abstracta con un método abstracto. El método abstracto puede ser el que consideren, no hace falta que este especificado en el enunciado.
 - Crear al menos una interfaz.
 - Realizar un main en donde se creen entradas para TODOS los diferentes tipos de eventos y según los datos colocados se muestre la información correspondiente a la entrada incluyendo su precio. Ejemplo: para el evento recital deben crear 2 entradas, una entrada vip y una entrada general.
- Polimorfismo

## Se deberá entregar:

 - El proyecto
 - Un word en donde se mencione cada una de las consignas desde A hasta J y una imagen en donde se vea donde la aplicación del código
 

## Recomendaciones

 - Recuerden trabajar con todas las clases que sean necesarias y vincularlas correctamente. Ejemplo: Si tengo una clase articulo, entonces en su interior va a contener un objeto de la clase categoría... a veces solemos encontrar dentro de la clase artículo un string perteneciente a su categoría y esto no es correcto.
 - Utilizar todos los paquetes que consideren necesario
