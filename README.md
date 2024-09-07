# LABORATORIO 3 - TDD

## INTEGRANTES

Cesar Andres Borray Suarez

Haider Andres Rodriguez Maldonado

## CREACION DEL PROYECTO MAVEN

Para la creacion del Proyecto con los parametros dados, usaremos el siguiente comando

![Creacion](/Capturas/Captura1.png)

### Agregar Dependencia JUnit5

Buscamos en el repositorio de maven la dependencia de JUnit5 en su version mas reciente

![JUnit5](/Capturas/Captura2.png)

Y la agregamos en nuestro pom.xml

![Pom](/Capturas/Captura3.png)

Verificamos que nuestra version de Java sea 17 y agregamos la configuracion al pom.xml

![Java Version](/Capturas/Captura23.png)

![Pom2](/Capturas/Captura24.png)

### Agregar Esqueleto Del Proyecto

Procedemos a crear los paquetes que se nos indica y verificamos

![Esqueleto](/Capturas/Captura4.png)

### Agregar Clases

Creamos las clases que se nos proporcionan y compilamos el proyecto

![Compilar](/Capturas/Captura25.png)

## PRUEBAS UNITARIAS Y TDD

Aca creamos 2 ramas independientes para cada integrante `Haider-Test` y `Cesar-Test`, posteriormente cada uno se encargo de crear los testeos para cada metodo a implementar y se hizo un pull request de ambas ramas a la rama `main`

![Pull Request](/Capturas/Captura26.png)

### Cobertura

Buscamos en el repositorio de maven la dependencia de Jacoco en su version mas reciente

![Dependencia](/Capturas/Captura27.png)

Y la agregamos al pom.xml junto a la seccion para su ejecucion dada en el laboratorio

![Pom3](/Capturas/Captura28.png)

Finalmente, compilamos el proyecto y en la carpeta `tarjet` verificamos el archivo `index.html` que tenga en las clases una cobertura superior del 80%

![Testeos](/Capturas/Captura30.jfif)
![Pom3](/Capturas/Captura29.jfif)

## SONARQUBE

Para usar SonarQube debemos descargar su imagen mediante Docker, por lo que primero vamos a instalar Docker

Nos dirigimos a la pagina de instalacion de Docker y uno de sus requisitos es activar la característica WSL 2 en Windows. Para esto usamos el siguiente comando en la consola de Powershell

![WSL](/Capturas/Captura6.png)
![Instalacion](/Capturas/Captura7.png)

Hecho este paso, reiniciaremos nuestro PC para seguir nuestro proceso de instalacion. Una vez reiniciada, aparecera la siguiente ventana

![Ubuntu](/Capturas/Captura8.png)

Esperaremos que se instale Ubuntu, y posteriormente nos pedira un nombre de usuario UNIX y la contraseña

![Usuario](/Capturas/Captura9.png)

Despues de dar el usuario y contraseña, seguira su instalacion y finalizara

![Final Instalacion](/Capturas/Captura10.png)

Ahora con WSL, podremos instalar Docker

![Docker](/Capturas/Captura11.png)

Descargamos el instalador y lo ejecutamos, una vez ejecutado nos pedira si queremos un shorcut en nuestro escritorio y empezara a hacer la instalacion

![Instalacion Docker](/Capturas/Captura12.png)
![Instalacion Docker](/Capturas/Captura13.png)

Una vez terminado, ya tendriamos Docker instalado y podemos continuar con SonarQube, ejecutamos el siguiente comando para descargar la imagen de SonarQube

![SonarQube](/Capturas/Captura14.png)

Ahora se debe arrancar el servicio de SonarQube con el siguiente comando

![Arranque](/Capturas/Captura15.png)

Validamos su funcionamiento

![Funcionamiento](/Capturas/Captura16.png)

Ahora nos dirigimos a nuestro browser y iniciamos sesión en sonar desde `localhost:9000`

![Iniciar Sesion](/Capturas/Captura17.png)

Luego nos pedira cambio de contraseña

![Contrasena](/Capturas/Captura18.png)

Estando en el Portal de SonarQube, nos dirigimos a nuestro perfil y seleccionamos la pestaña de Security y generamos nuestro Token

![Token](/Capturas/Captura19.png)

Ahora instalamos SonarLint en nuestro IDE de desarrollo, en nuestro caso en Visual Studio Code

![SonarLint](/Capturas/Captura20.png)

Luego añadimos el plugin de Sonar y las propiedades de SonarQube y Jacoco en el archivo pom del proyecto.

![Pom4](/Capturas/Captura21.png)

Finalmente generamos la integracion con SonarQube cons el siguiente comando, donde debemos poner el Token que generamos anteriormente

![Integracion](/Capturas/Captura22.png)