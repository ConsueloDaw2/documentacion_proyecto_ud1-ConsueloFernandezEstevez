

# Gestor de incidencias

## Nombre, finalidad y descripción breve del proyecto
- **Nombre**: gestor de incidencias
- **Finalidad**: su finalidad es la de servir de soporte para consultar los avisos del centro
- **Descripción breve**: de manera sencilla se muestran en un menú de consola cinco opciones para consultar las incidencias. En el listado de funcionalidades se especifican las mismas.

## Versión de java que utiliza
- java 25.0.3.
- javac 25.0.3. 

## Listado de funcionalidades que permite realizar la aplicación
1. muestras todas las incidencias, 
2. muestra las incidencias abiertas,
3. buscar incidencias,
4. consultar una incidencia por su ID y,
5. salir del programa.

## Compilación y ejecución

```bash
.\mvnw.cmd clean compile exec:java

```
Al ejecutarse sin argumentos de abre el menu interactivo.

## Generación y consulta de Javadoc

```bash
.\mvnw.cmd javadoc:javadoc

```

## Tabla con las clases principales y su responsabilidad general
| Clase | Responsabilidad |
|---|---|
| `App` | Inicio. Gestiona la interacción con el usuario por consola: menú interactivo y operaciones por línea de comandos. |
| `GestorIncidencias` | Contiene el conjunto de incidencias fijas y ofrece una lista de operaciones: listar, listar abiertas, buscar por texto y buscar por identificador. |
| `Incidencia` | Representa un aviso de soporte con su identificador, título, prioridad y estado (abierta o cerrada). |
| `IncidenciaNoEncontradaException` | Excepción que se lanza cuando se consulta un identificador que no existe. |


## Estructura de archivos
```
documentacion_proyecto_ud1-ConsueloFernandezEstevez/
├── .mvn/
├── docs/
├── src/
│   └── main/
│       └── java/
│           └── es/
│               └── centro/
│                   └── incidencias/
│                       ├── App.java
│                       ├── GestorIncidencias.java
│                       ├── Incidencia.java
│                       └── IncidenciaNoEncontradaException.java
├── .gitignore
├── ENUNCIADO_ACTIVIDAD.md
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Enlace a la documentación Javadoc publicada mediante GitHub Pages
<https://consuelodaw2.github.io/documentacion_proyecto_ud1-ConsueloFernandezEstevez/>
