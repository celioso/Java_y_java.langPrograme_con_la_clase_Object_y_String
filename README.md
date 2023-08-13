# Java y java.lang: Programe con la clase Object y String curso de Alura

# Trabajando con paquetes

¡Ha llegado el momento de aplicar lo visto en clase!

1. como se muestra en el video, abra el **navegador** y cree la carpeta **modelo** y coloque todas sus clases que no sean de **test**.

2. Cree una segunda carpeta con el nombre **test** y mueva todos sus archivos de prueba a ella.

3. En su clase *CalculadorDeImpuestos*, coloque el *package* donde se encuentra, en este caso, *package* modelo.

```java
package modelo;

public class CalculadorDeImpuestos{
```

4. ¡Ahora replique el código de declaración del *package* para todos los archivos que están realmente contenidos en este *package* modelo!

5. Realice el mismo paso anterior, pero ahora para su *package* **test**.

6. Modifique el nombre de las clases para indicar en qué *package* se encuentran (full qualified name)

`modelo.CuentaCorriente cc = new CuentaCorriente(222, 333);`

NOTA: ¡Esto corregirá los errores que indicará el eclipse!

7. Crea una carpeta con el nombre del proyecto, en el curso usamos el nombre **banco**.

8. Coloque sus carpetas **modelo** y **test** dentro de la carpeta del proyecto.

NOTA: Tenga en cuenta que tendremos el mismo error de compilación que antes.

9. Cree una carpeta con el nombre de la empresa, en este caso, **bytebank** y coloque su carpeta **banco** dentro de ella.

10. Conforme a lo explicado en el video, crea las carpetas **br** y **com**, luego coloque la carpeta **bytebank** dentro de la carpeta com, después de eso, coloque la carpeta **com** dentro de **br**.

NOTA: El Full Qualified Name de **CuentaCorriente** ahora es **br.com.bytebank.banco.modelo.CuentaCorriente**

11. Modifique el nombre de sus packages en sus archivos como se hizo en el paso 3.

`package br.com.bytebank.banco.modelo;`

12. Deje de usar FQN y comience a importar el paquete necesario para su clase.

`import br.com.bytebank.banco.modelo.*;`

NOTA: El * indica que estamos importando todo el contenido de *modelo*.

13. Realice los cambios necesarios para compilar su código.

## Lo que aprendimos

¿Qué aprendimos?

- Los packages sirven para organizar nuestro código.
- Los packages son parte del FQN (*Full Qualified Name*) de la clase.
- El nombre completo de la clase (FQN) consta de: PACKAGE.NOMBRE_SIMPLE_DE_LA_CLASE
- La definición de package debe ser la primera declaración en el código fuente
- Para facilitar el uso de clases de otros packages, podemos importarlas
- Los *import* son justo después de la declaración del package
- La nomenclatura padrón es usar el nombre de dominio en la web al revés con el nombre del proyecto, por ejemplo:

```java
br.com.caelum.geradornotas
br.com.alura.gnarus
br.gov.rj.notas
de.adidas.lager
```

Una vez organizadas nuestras clases, podemos revisar los modificadores de visibilidad que dependen de los paquetes. ¿Continuamos?

## Modificadores de acceso
¡Este es el momento de hacer lo que se vio en el video!

1. En la clase **Cuenta**, elimine el modificador de acceso **public** y observe que su código en el **package** test deja de compilarse. Eliminando el modificador de acceso, transformamos la clase en **package private**, es decir, solo es visible dentro del paquete en el que está contenida.

2. Creamos una nueva clase, usamos el nombre **CuentaEspecial**, seleccionamos la superclase (Cuenta), también creamos un package llamada **especial** para la clase creada.

3. Tenemos un error de compilación, corríjalo implementando el constructor.

4. En la clase **Cuenta**, elimine el modificador **protected** del atributo saldo, transformándolo en un **package private**.

5. Tenga en cuenta que aunque la clase **CuentaEspecial** es una clase hija de **Cuenta**, no tiene acceso al atributo **package private**.

6. Vuelva a poner el **protected** y verifique que su clase hija tenga acceso nuevamente al atributo de la clase madre, incluso si está en otro paquete.

NOTA: ¡Solo es visible para los hijos!

# Lo que aprendimos

¿Qué aprendimos?

En esta clase volvimos a hablar sobre visibilidad y aprendimos:

+ Hay 3 palabras clave relacionadas con la visibilidad: private, protected, public
+ Hay 4 niveles de visibilidad (de menor a mayor):
 + `private` (visible solo en clase)
 + `<<package private>>` (visible en la clase y en cualquier otro miembro del mismo paquete, que puede ser llamado de default)
 + `protected` (visible en la clase y en cualquier otro miembro del mismo paquete y para cualquier hijo)
 + `public` (visible en cualquier paquete)
+ Los modificadores pueden ser usados en la definición de la clase, atributo, constructor y método.

##Todas las etiquetas

Ya vimos en esta clase algunas tag (o anotaciones) de javadoc como @version o @author.

Aquí está la lista completa:

- @author (usado en la clase o interfaz)
- @version (usado en la clase o interfaz)
- @param (usado en el método y constructor)
- @return (usado solo en el método)
- @exception o @throws (en el método o constructor)
- @see
- @since
- @serial
- @deprecated
Es importante que las etiquetas javadoc existan solo para estandarizar algunos datos fundamentales de su código fuente, como el autor y la versión.

## Otras anotaciones

En los cursos también ha visto una anotación fuera del javadoc, la anotación @Override. Esta anotación se considera una configuración, en este caso interpretada por el compilador.

Las anotaciones van mucho más allá de los tags de javadoc y son mucho más sofisticadas y poderosas. Ellas ingresaron a la plataforma Java desde la versión 1.5 mientras que el javadoc ha estado presente desde el nacimiento de la plataforma Java. Lo interesante es que las anotaciones se inspiraron en las etiquetas javadoc.

Si aún no está seguro sobre el uso de las anotaciones, tenga la seguridad de que aún verá muchas usadas por las bibliotecas que se utilizan para definir datos y configuraciones. ¡Espere!