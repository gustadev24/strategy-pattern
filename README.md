# Patrón Strategy - Ejemplo con Armas

## ¿Qué es el Patrón Strategy?

El patrón Strategy define una familia de algoritmos, encapsula cada uno de ellos y los hace intercambiables. Permite que el algoritmo varíe independientemente de los clientes que lo utilizan.

## Estructura del Ejemplo

- **WeaponStrategy**: Interfaz que define el comportamiento de ataque
- **SwordStrategy, AxeStrategy, BowStrategy**: Implementaciones concretas de diferentes tipos de ataques
- **Warrior**: Contexto que usa una estrategia de arma
- **Main**: Ejemplo de uso

## Ventajas

- Elimina condicionales complejos (if/switch)
- Facilita agregar nuevas estrategias sin modificar código existente
- Permite cambiar el comportamiento en tiempo de ejecución

## Ejecución

```bash
cd src
javac *.java
java Main
```

## Salida Esperada

```
Ragnar está atacando:
Ataque con espada: ¡Corte rápido!

Ragnar está atacando:
Ataque con hacha: ¡Golpe devastador!

Ragnar está atacando:
Ataque con arco: ¡Flecha precisa!
```

## Cómo Extender

Para agregar una nueva arma, simplemente crea una clase que implemente `WeaponStrategy` y define su método `attack()`.