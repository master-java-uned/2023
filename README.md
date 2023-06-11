# HealthMap
Descripción

## Capitulo 1
sddf

## Capitulo 2
![Image J2EE](https://i.pinimg.com/originals/3d/40/5e/3d405ea2c7bd76cbe4f21e9ac941758c.jpg)

* Listas
    * 1Sun Java System Application.
    * 2Sun Java System Web Server.
    * 3Apache Tomcat para Java Web Services Development Pack.

## Protocolo HTTP
* Protocolo de transferencia es el sistema mediante el cual se envían las peticiones de acceso a una página y la respuesta con el contenido.
* **HTTP es un protocolo sin estado.**
* Al finalizar la transacción todos los datos se pierden. Por esto se popularizaron las cookies, que son pequeños ficheros guardados en el propio ordenador que puede leer un sitio web al establecer conexión con él, y de esta forma reconocer a un visitante que ya estuvo en ese sitio anteriormente.

```html
telnet 127.0.0.1 80
 Trying 127.0.1.1...
 Connected to pi-.
 Escape character is '^]'.
 GET index.html
 <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
 <html><head>
 <title>400 Bad Request</title>
 </head><body>
 <h1>Bad Request</h1>
 <p>Your browser sent a request that this server could not understand.<br />
 </p>
 <hr>
 </body></html>
 Connection closed by foreign host.
```


### Servlet
#### Introducción
* En

### Descripcion exata de un Servlet
#### ¿Qué es un servlet?
* Unecesarias para la escritura de applets. De hecho se usan los servlets para gestionar conexiones http usaremos las clases del paquete javax.servlet.http.
* El ciclo de ejecución de un servlet es análogo al de un applet con ligeras diferencias. Inicialmente el servlet debe extender a la clase HttpServlet:
```java
import javax.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
public class MiServlet extends HttpServlet{
   ....
}
```
