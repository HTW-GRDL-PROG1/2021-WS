## Praktische Vorlesung vom 16.11.21 über Arrays

## Inhalt

`examples`:
- `ArrayCopy.java`: Array Kopieren
- `ArrayCreation.java`: Array Erstellen
- `ArrayReverse.java`: Array Umdrehen
- `ArrayZero.java`: 1D und 2D Array programmatisch mit Nullen erstellen und initialisieren

`student`:
- `Student.java`: Beschreibung eines Studenten (Stichwort: Objektorientierte Programmierung)
- `StudentExample.java`: Filtern eines Arrays von Studenten nach dem Studiengang

## Array handling mittels Index

```java
// Erstellen eines Array mit vier boolschen Werten
boolean boolschesArray = {true, true, true, false};
```

Das hat die folgende interne Darstellung
```java
Arrays.toString(boolschesArray) -> [true, true, true, false]
```

Die Länge des Arrays kann mit Hilfe des `.length()` Attribut bestimmt werden
```java
boolschesArray.length() -> 4
```

Die Elemente im Array können über ihren `index` erreicht werden. Beim `index` fängt man bei `0` an zu zählen.
```java
boolschesArray[0] -> true
boolschesArray[1] -> true
boolschesArray[2] -> true
boolschesArray[3] -> false
```

Der höchste erreichbare `index` entspricht der Länge des Arrays minus `1`
```java
int hoechsterIndex = boolschesArray.length() - 1;
boolschesArray[hoechsterIndex] -> false
```

Der Versuch auf einen nicht existierenden `index` zuzugreifen führt zu einem Fehler
```java
boolschesArray[4] -> Error: ArrayIndexOutOfBoundsException
```

## Default Werte von Arrays

Wenn wir versuchen auf einen Array zuzugreifen, für den noch keine Werte initialisiert wurden, dann weißt der Kompiler dem Array default Werte zu. Hier beispielhaft ein paar Typen und ihre default Werte:

- `boolean` : `false`
- `int`     : `0`
- `double`  : `0.0`
- `String`  : `null`

Ein Array vom Typ `int` ist also standardmäßig mit Nullen gefüllt

```java
int[] leeresArray = new int[4];
Arrays.toString(leeresArray) -> [0, 0, 0, 0]
```

Andere Werte können dem Array wiederum mit Hilfe des Index zugewiesen werden

```java
leeresArray[0] = 50;
// Werte [50][0][0][0]
// Index   0  1  2  3

leeresArray[1] = 25;
// Werte [50][25][0][0]
// Index   0   1  2  3

leeresArray[3] = 45;
// Werte [50][25][0][45]
// Index   0   1  2   3
```

Wir können also auch bestehende Werte überschreiben
```java
leeresArray[1] = 37;
// Werte [50][37][0][45]
// Index   0   1  2   3
```