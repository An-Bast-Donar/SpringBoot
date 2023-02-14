# SpringBoot

Aprende Spring Boot de Cero a Master

## Spring Framework 5

- Inyeccion de dependencias: caracteristica principal, contiene componentes, beans, anotaciones que simplifican la programacion
- Modelo vista controlador mvc: interactua con el control de los datos, visualizacion de la informacion etc
- Modelo programaicon reactiva webflux: trabajo asincrono y de forma reactiva como angular
- Acceso a datos y persistenca jpa: para trabajar con sql, hibernate, etc
- Programacion orientada a aspectos aop: intercepta peticiones, guarda datos, etc, funcionalidades extra
- Cero configuracion: todo ya viene configurado, servidor etc
- Minimo requerido jdk 8: minimo sdj de java para trabajar
- Programacion funcional con reactor: programacion funcional

## Herramientas necesarias

- jdk: jdk de java, podemos usar la 11 o la 13, podemos usar la comercial o la free (open jdk), para cualquiera que se instale se debe configurar la variable de entorno de la siguiente manera; 1.se accede a las variables del entorno, 2.se crea una variable en el menu principal que se llame JAVA_HOME con la direccion de la carpeta del jdk, 3.se crea una ruta dentro de la variable path con la direccion bin de la carpeta del jdk, 4.revisamos la instalacion desde la linea de comando con $ java -version o $ java --version y javac --version
- spring tools IDE: ide robusto para trabajar, trae todo configurado, base de datos, servidor etc, todas esas opciones se pueden reconfigurar, para instalarlo ingresamos a spring.io/tools y lo descargamos para eclipse, descomprimimos, guardamos, seleccionamos donde se guardaran los proyectos y podemos empezar a crear proyectos nuevos

## Crear proyecto

- Se crea un proyecto en create new spring starter project
- Se selecciona el nombre, el tipo de administrador de dependencia, el packaging (mejor y mas comun jar que war, pero war tambien sirve sobre todo para publicar en algunos servidores), se selecciona la version de java, el group, el package, y alguna otra configuracion necesaria
- Se selecciona la version de spring boot, una estable que no sea snapshot
- Se seleccionan las primeras librerias y dependencias para el proyecto, principalmente: web->spring web, template engines-> thymeleaf, developer tools->spring boot devtools
- Existen otras dependencias que se pueden importar dependiendo de con que base de datos se trabaje
- Otra forma de crear un proyecto es mediante la pagina start.spring.io donde indicamos todos los parametros iniciales de nuestro proyecto, las dependencias basicas a usar y generamos el proyecto base

## Correr un proyecto

- Si se marca error por dependencias, se debe cerrar eclipce, borrar la carpeta .m2, se actualiza mavel en el proyecto(click derecho, maven, update)
- Para levantar un proyecto se hace sobre el package explorer, clic derecho, run as, spring boot app
- Para relevantar el proyecto, cancelar u alguna otra accion, hacerlo en el Boot Dashboard o con la dependencia devtools, para desplegar cambios automaticos de forma automatica

## Estructura de un proyecto

- Carpeta src/main/java/nombre_del_package_de_la_configuracion: estaran todas las clases, este es el package principal
- Archivo pom.xml: se modifica la version de java y las dependencias
- Archivo nombre_del_proyecto_Application.java: es la clase principal de la aplicacion, la que ejecuta el proyecto
- Archivo application.properties: aca se pueden sobrescribir todas las configuraciones de nuestro proyecto, se puede cambiar el puerto (tener cuidado de no colocar espacios en blanco innecesarios dentro de este archivo), el string de conexion, url, conexiones a bd, credenciales, username, conector, driver, dialecto para el motor, entre otras cosas
- Carpeta static: todos los recursos estaticos de la app, hojas de estilo, js, imagenes, etc
- Carpeta template: guardar las plantillas de los controladores

## Documentacion del proyecto

- Todas las clases deben estan dentro del paquete base (src/main/java/nombre_del_package_de_la_configuracion), si hay otros paquetes tambien eben ir dentro de este paquete, ej: src/main/java/nombre_del_package_de_la_configuracion.controller

1. spring-boot-web: introduccion a springboot
2. spring-boot-di: introduccion a la inyeccion de dependencias
3. spring-boot-backend-apirest: introduccion a creacion de un apirest, de ser el caso hay que actualizar el archivo properties con un nuevo, usuario, contraseña, base de datos, accion al conectar el servidor con la bd y algun otro parametro

## Configuraciones en el editor

- En preferencias -> maven -> instalaciones podemos ver la version de maven que viene incluida y agregar otras aparte
- En preferencias -> java -> installed jres podemos ver la variable java configurada y añadir mas, en -> execution environment podemos ver las demas versiones configuradas
- En help -> Eclipse Marketplace, podemos ver y descargar plugins para nuestro framework, por defecto el plugin spring tools 4 viene instalado y listo para trabajar

## Desplegar la app

1. En la terminal, dentro de la careta del proyecto ejecutar el comando: $ .\mvnw.cmd package, se requiere tener instalado el java_home para esto
2. Correr el archivo creado por el comando anterior con: $ java -jar .target\nombre_derl_archivo.jar

## Spring Rest

- API: Interfaz de programacion de aplicaciones, conjuto de reglas o protocolos que permiten que aplicaciones se comuniquen entre si.
- REST: Estilo de arquitectura de software para diseñar servicios web (respresetantional state transfer).
- REST FULL: Aplicacion Rest que sigue buenas practicas de programacion.
- API REST: Estilo de arquitectura de software que se usa para construir aplicaciones que se comuniquen entre si por medio de http.
- API REST FULL: una Api Rest con buenas practicas de programacion.
- Rest es independiente del lenguaje usado, puesto se pueden comunicar aplicaciones creadas en diferentes lenguajes de programacion.
- Una ApiRest intercambia informacion comunmente en formatos XML o JSON pero existen otros formatos en los que se puede intercambiar informacion.

## Diferencias entre Hibernate, JPA, JPQL, JUnit

JPA, JPQL, Hibernate y JUnit son tecnologías y herramientas utilizadas en el desarrollo de aplicaciones Java.

- JPA: Java Persistence API es una especificación de Java para la gestión de datos en aplicaciones Java. JPA define una serie de interfaces y clases para trabajar con bases de datos relacionales. JPA permite a los desarrolladores crear entidades Java que representan objetos en la base de datos y proporciona una serie de operaciones para manejar estos objetos, como guardar, actualizar, buscar y eliminar.

- JPQL: Java Persistence Query Language es un lenguaje de consulta para JPA que permite a los desarrolladores escribir consultas en un lenguaje de programación orientado a objetos en lugar de SQL. JPQL se utiliza para buscar entidades en una base de datos a través de la capa de persistencia. JPQL utiliza conceptos como entidades, atributos y relaciones para construir consultas.

- Hibernate: es un framework de persistencia de objetos para Java que implementa la especificación JPA. Hibernate proporciona una serie de características avanzadas, como el mapeo objeto-relacional, caché de primer y segundo nivel, recuperación perezosa y transacciones.

- JUnit: es un framework de pruebas unitarias para Java. JUnit proporciona una serie de anotaciones y clases para escribir y ejecutar pruebas unitarias automatizadas en aplicaciones Java. Las pruebas unitarias son pruebas automatizadas que se ejecutan en fragmentos aislados de código para asegurar que el código funciona correctamente y no produce errores.

En resumen, JPA y Hibernate son tecnologías utilizadas para persistir objetos Java en una base de datos relacional, mientras que JPQL es un lenguaje de consulta utilizado para buscar y recuperar entidades de una base de datos a través de JPA. JUnit es una herramienta de pruebas unitarias que se utiliza para probar y validar el código Java.

## Pruebas unitarias en springboot

- Es una tecnica para comprobar que un bloque de codigo esta funcionando correctamente
- TDD: es una practica para pruebas, consta de escribir primero la prueba y luego la solucion, existen otros tipos de practicas para pruebas
- Junit es una dependencia de java para hacer pruebas al igual que Mockito
