README.txt
Proyecto: Automatización de prueba funcional para saucedemo
Framework: Serenity BDD + Cucumber
Fecha: 16/02/2026

============================================================
1. REQUISITOS PREVIOS
============================================================

Asegúrese de tener instaladas las siguientes versiones:

- Sistema Operativo: Microsoft Windows 11 Enterprise
 
- Java:
  Versión requerida: 1.8.0_451
  Comando para validar: java -version


- Maven:
  Versión requerida: 3.9.1
  Verificar con: mvn -versión

- Serenity BDD: 3.9.0

- Cucumber: 3.9.0

- Google Chrome:
  Versión validada durante la ejecución: Versión 145.0.7632.76 
  Verificar en: chrome://settings/help

- ChromeDriver:
  Compatible con la versión instalada de Chrome
 

============================================================
2. INSTRUCCIONES PARA ABRIR EL PROYECTO EN INTELLIJ IDEA
============================================================

1. Descomprimir el proyecto en una carpeta local.
2. Abrir el Intellij IDEA
3. Seleccionar "Open"
4. En "Open File or Project", ubicar la carpeta donde se encuentra el proyecto
5. Presionar el botón "OK"


============================================================
3. EJECUCIÓN DE LAS PRUEBAS
============================================================

1. Localizar la clase "Runner" dentro de la carpeta src/test/java
2. Si desea ejecutar todos los casos de prueba, configure la sección @CucumberOptions de la siguiente manera:

tags = "@Login or @AgregarProductos or @Formulario or @Compras"

3. Si desea ejecutar un caso específico, indique únicamente el tag correspondiente en la propiedad tags

Por ejemplo: tags = "@Login"

Reemplace @Login por el tag del caso que desea ejecutar.

4. Ubicarse sobre public class Runner 

5. Clic derecho y presionar sobre "Run 'Runner'"


============================================================
4. GENERACIÓN Y UBICACIÓN DEL REPORTE
============================================================

Una vez finalizada la ejecución:

1. Ubicar la ventana de Maven en el panel lateral derecho de IntelliJ IDEA
2. Ubicar la carpeta "Plugins" y expandirla 
3. Localizar el plugin serenity y ejecutar la opción serenity:agregate
4. Una vez finalizada la ejecución, verificar en la consola la ruta donde se generó el reporte
5. Alternativamente, puede acceder directamente a la ruta target/site/serenity/ dentro del proyecto y abrir el archivo index.html 


============================================================
5. CONSIDERACIONES
============================================================

- Cerrar todas las instancias de Chrome antes de ejecutar.
- No modificar la estructura del proyecto.
- Verificar conexión a internet si el entorno bajo prueba lo requiere.


