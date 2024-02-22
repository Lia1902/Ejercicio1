Nombre del proyecto:PetStore

Entorno de desarrollo utilizado: Intellij Idea 2023.2.1 (Community Edition)
Lenguaje: Gherkin
Herramienta: Cucumber

Se realizó la implmentación de los siguientes casos:

• Autenticarse con el usuario: standard_user y password: secret_sauce
• Agregar dos productos al carrito y visualización de los productos agregados 
• Completar formulario hasta la finalización de la compra.


--------------------- Creación de estructura del proyecto ---------------------

- Dentro de la carpeta java (Ubicada dentro de la carpeta test de la carpeta "src")
- Se creó el paquete "com.sauce.pe".
- Dentro del paquete "com.sauce.pe", se crearon los paquetes "definitions", "page", "steps", "utilities" y la clase de Runner.
- Se creó el directorio"resources".
- Dentro del paquete "Definitions", se creó la clase "LoginDef" y el paquete "compra" creándose en este paquete la clase "CompraDef".
- Dentro del paquete "pages", se crearon los paquetes "login", "productos", "compras" y "validations".
- Dentro del paquete "login" se creó la clase "LoginPage".
- Dentro del paquete "productos" se creó la clase "SeleccionProductoPagina".
- Dentro del paquete "compras" se creó la clase "ComprasCarPagina"
- Dentro del paquete "validations" se creó la clase "validationPage".
- Dentro del paquete "steps" se crearon los paquetes "login", "productos", "compras" y "validations".
- Dentro del paquete "login" se creó la clase "LoginStep".
- Dentro del paquete "productos" se creó la clase "SeleccionProductoPaso".
- Dentro del paquete "compras" se creó la clase "ComprasCarPaso".
- Dentro del paquete "validations" se creó la clase "validationStep".
- Dentro del directorio "resources", se crearon los directorios "drivers" y "feature".


--------------------- Configuración del pom.xml ---------------------

- Se agregaron dependencias de serenity-core, serenity-cucumber, serenity-junit, junit.
- Se agregaron los plugins necesarios tales como por ejemplo de serenity.


--------------------- Ejecución ---------------------

- Seleccionar la clase Runner
- Para realizar la ejcución de cada escenario, bastará con indicar el tag correspondiente.
- Por ejemplo:Para este caso el tags = "@ComprasEnLinea and @CompraExitosa"

package com.sauce.pe;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "com.sauce.pe.definitions",
        tags = "@ComprasEnLinea and @CompraExitosa"
)
public class Runner {
}


 






