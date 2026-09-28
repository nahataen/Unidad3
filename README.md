# 📚 Unidad 3 de Java — ITT

> Captura por consola de materias, alumnos y calificaciones usando la clase `Materias` y un vector de objetos.

## Qué contiene

- `src/Materias.java`: clase con campos públicos `NombreMateria`, `CantidadDealumnos` y `Calificacion[]`, con constructor que los inicializa.
- `src/Main.java`: pide la cantidad de materias, y por cada una el nombre, la cantidad de alumnos y cada calificación (`Scanner`); guarda todo en un `Materias[]` y al final imprime cada materia con sus calificaciones.

## Estructura

```text
itt-java-u3/
├── README.md
└── E3-1SalasFigueroaJesusNahataen/
    ├── .classpath
    ├── .gitignore
    ├── .project
    ├── .settings/org.eclipse.jdt.core.prefs
    └── src/
        ├── Main.java
        └── Materias.java
```

Proyecto Eclipse Java (paquete por defecto), sin Maven/Gradle.

## Requisitos

- JDK 8 o superior (`javac` / `java`).

## Cómo correr

```bash
cd "E3-1SalasFigueroaJesusNahataen/src"
javac Main.java Materias.java
java Main
```

Programa interactivo: sigue los mensajes (`Ingrese cantidad de materias`, `Ingresa el nombre de la materia...`, `Ingresa la calificacion`).

## Notas

- Repo escolar/histórico del ITT, conservado como archivo. Un solo ejercicio de vectores de objetos, sin tests ni persistencia.
