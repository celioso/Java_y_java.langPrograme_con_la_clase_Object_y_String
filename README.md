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

# Ejercicio Javadoc
El Javadoc solo estará disponible para las instalaciones de JDK’s y no para las de JRE’s. Asegúrate de estar usando un JDK.

1. Cuando creamos nuestras clases, no hay nada más justo que agregar información sobre el autor. En este sentido, cambiaremos la clase Cliente.java y agregaremos metainformación sobre el autor y su versión.

```java
/ **
* Clase que representa a un cliente en ByteBank
*
* @autor Nico Steppat
* @version 0.1
* /
public class Cliente {
    /* código omitido */
}
```

Recuerde que el uso del atajo `/**` Eclipse agrega automáticamente la documentación con @author por usted. Vale la pena acostumbrarse a este atajo.

2. Haz lo mismo con la clase Conta.java.

3. Sabemos que la documentación puede ir más allá del nombre y la versión del autor, por ejemplo, documentar métodos y constructores. Usando el atajo `/ **`, documente el constructor de la clase Cuenta.java. El resultado de la documentación debería verse así:

```java
/**
* @param agencia
* @param numero
*/
public Cuenta(int agencia, int numero) {
    /* código omitido */
}
```

El atajo` / **` solo agrega información sobre los parámetros del método, y es responsabilidad del desarrollador completar la documentación.

```java
/**
* Constructor para inicializar el objeto Cuenta a partir da agencia y numero
* @param agencia
* @param numero
*/
public Cuenta(int agencia, int numero) {
    /* código omitido */
}
```
4. Aún en la clase Cuenta.java, documente el método sacar. Use el atajo `/ **` nuevamente:

```java
/**
* valor necesita ser menor o igual al saldo
* @param valor 
* @throws SaldoInsuficienteException
*/
public void sacar(double valor) throws SaldoInsuficienteException {
    /* código omitido */
}
```

5. A través de *Quick Access* (Acceso rápido), busque Javadoc en View. Al seleccionar la opción, se mostrará la pestaña "Javadoc". Intente hacer clic en las clases que acaba de documentar. La pestaña "javadoc" mostrará la documentación de la clase.

6. Además de mostrar la documentación haciendo clic en cada clase documentada, podemos generar la documentación como un archivo para ser consultado. Para hacer esto, accede al menú Project -> Generate Javadoc.

En la lista de proyectos mostrados, asegúrese de seleccionar el proyecto bytebank-heredando-cuenta. Asegúrese de que el Javadoc command esté lleno con la ruta de la herramienta javadoc. Utilice en la opción *User standard docket* la ruta del proyecto padrón, sin ningún cambio. Finalmente, haga clic en el botón "Finish" para generar la documentación.

7. Verifique la carpeta doc generada con la documentación. Acceda al archivo doc/resources/index.html. Esta página es el punto de entrada para la documentación. Navegue por las clases documentadas comprobando el resultado.

## Haga lo que hicimos en clase: javadoc
Sabemos que el código producido por un desarrollador de Java puede ser utilizado por otros desarrolladores. En este sentido, documentar el código y facilitar su uso por otros desarrolladores es una buena práctica a seguir.

En cuanto a la generación de documentación, podemos usar Javadoc, para la distribución podemos empaquetar la aplicación en un jar. Comencemos con Javadoc.

## Haga lo que hicimos en clase: JAR

Sabemos que a través de jars podemos facilitar el intercambio de nuestro código entre equipos. Ha llegado el momento de practicar.

1. En Eclipse, haciendo clic derecho en el *proyectobytebank-heredado-cuenta*, seleccione la opción **export**. Se mostrarán varias opciones de exportación, seleccione las que están dentro del grupo **java** y dentro de ella la opción **JAR File** haga clic en *"NEXT"*. Veamos el siguiente paso a seguir.

2. En el proyecto *proyectobytebank-heredado-cuenta*, seleccione solo la carpeta *src*. También desmarque los archivos .classpath y .project. Asegúrese de que solo esté marcada la opción **"Export generated class files and resources"**. En "Jar File", seleccione una carpeta de fácil acceso en la que se guardará el archivo jar que vamos a crear. Haga clic en *Finish* y, si se muestra alguna advertencia, ignórela por completo.

3. Verifique la existencia del archivo jar creado.

4. Para probar el archivo jar recién creado, cree un nuevo proyecto java llamado *bytebank-biblioteca*. Cierre el resto de proyectos para que sea más fácil concentrarse en el nuevo proyecto.

5. Con el botón derecho en el nuevo proyecto, elija New -> Folder. Para el nombre del folder, elija libs.

6. Copie el jar exportado en la carpeta libs recién creada.

7. Copiar el archivo jar en un proyecto no es suficiente, debe estar en el *class path*. Haga clic con el botón derecho en el archivo jar dentro de la carpeta libs y elija la opción *add to build path*. Vea si seleccionó la opción "Package Explorer". Si tiene la opción *Navigator* seleccionada, no aparecerá *Build Path*.

8. Ahora que nuestro proyecto ve el jar creado, cree la clase *TestLibreria* en el paquete `br.com.alura.bytebank`. Su propósito es importar algunas clases del jar importado:

```java
package br.com.alura.bytebank;


import br.com.bytebank.banco.modelo.Cuenta;
import br.com.bytebank.banco.modelo.CuentaCorriente;


public class TestLiberia {


    public static void main(String[] args) {
        Cuenta c = new CuentaCorriente(123, 321);
    }
}
```
Excelente, acaba de importar los recursos de un archivo jar.

## Para saber más: Maven

Java es una plataforma de desarrollo completa que destaca por su gran cantidad de proyectos de código abierto (open source). Para la mayoría de problemas en el día a día del desarrollador ya existen librerías para solucionar. Es decir, si te gustaría conectarte con una base de datos, o trabajar en desarrollo web, en el área de ciencia de datos, creación de servicios o Android, ya existen librerías para esto, muchas veces más de una.

Existe la necesidad de organizar, centralizar y versionar los JARs de esas librerías y administrar las dependencias entre ellos. Para solucionar esto, se crearon herramientas específicas y en el mundo Java se destacó **Maven**. Maven organiza los JARs (código compilado, código fuente y documentación) en un repositorio central que es público y se puede buscar:

[mvnrepository.com](https://mvnrepository.com/ "mvnrepository.com")

Allí puede ver e incluso descargar los archivos JARs, pero lo mejor es que la herramienta Maven puede hacer esto por usted.

Nota: si es un usuario de Linux, Maven es muy similar a los administradores de *apt* o *rpm*. En MacOS existe *brew* con el mismo propósito. En el mundo .Net tenemos *nuget* y la plataforma node.js usa *npm*. La gestión de dependencias es un problema cotidiano para el desarrollador, y cada sistema o plataforma tiene su propia solución.

## Lo que aprendimos

¿Qué aprendimos?

En esta sección más ligera vimos y aprendimos:

- Qué comentarios y tags (anotaciones) usar para definir el javadoc
- Cómo generar javadoc en Eclipse
- Que javadoc es una documentación para desarrolladores
- Que las clases estándar de Java también usan javadoc
- Cómo crear nuestra propia librería a través de JAR (J*ava *ARchive)
- Cómo importar librerías al nuevo proyecto
- Cómo crear un JAR ejecutable
En la siguiente clase conoceremos el paquete java.lang.

### Proyecto del aula anterior
¿Comenzando en esta etapa? Aquí puedes descargar los archivos del proyecto que hemos avanzado hasta el aula anterior.
[Descargue los archivos](https://github.com/alura-es-cursos/1786-java-string-object/tree/clase-3 "Descargue los archivos") en Github o haga clic [aquí](https://github.com/alura-es-cursos/1786-java-string-object/archive/clase-3.zip "aquí") para descargarlos directamente.