# Ejercicio-5
Ejercicio 5 - Miguel Sajquin 252149
# 🖥️ Simulador de Sistema Operativo - Gestión de Procesos

## 📋 Descripción
Simulador de un sistema operativo que gestiona diferentes tipos de procesos utilizando el patrón de diseño MVC (Modelo-Vista-Controlador) y polimorfismo en Java.

## 🎯 Objetivo
Demostrar el uso de polimorfismo mediante herencia para gestionar diferentes tipos de procesos que se ejecutan de manera uniforme sin que el planificador conozca sus tipos específicos.

## 🏗️ Estructura del Proyecto

### **Patrón MVC Implementado:**
```
📦 SistemaProcesos
├── 🎨 Vista (Vista.java)
├── ⚙️ Controlador (Controlador.java) 
├── 📊 Modelo
│   ├── Procesos.java (clase abstracta)
│   ├── CPU.java
│   ├── Daemons.java
│   └── EntradaSalida.java
└── 🚀 Main.java
```

## 🧩 Componentes del Sistema

### **Clases del Modelo:**

1. **`Procesos`** (Abstracta)
   - Atributos: `name`, `PID`, `accion`
   - Método abstracto: `ejecutar()`

2. **`CPU`** - Procesos intensivos en cálculo
3. **`Daemons`** - Procesos en segundo plano  
4. **`EntradaSalida`** - Procesos de E/S con dispositivos

### **Características de Implementación:**
- ✅ **Polimorfismo puro** mediante herencia
- ✅ **Controlador** no conoce tipos específicos de procesos
- ✅ **Separación clara** de responsabilidades (MVC)
- ✅ **Encapsulamiento** correcto de atributos

## 🎮 Funcionalidades

### **Menú Principal:**
```
=== SISTEMA DE PROCESOS ===
1. Añadir proceso
2. Ejecutar procesos  
3. Salir
```

### **Tipos de Procesos Disponibles:**
1. **CPU** - Tareas intensivas de cálculo
2. **Daemons** - Servicios en segundo plano
3. **Entrada y Salida** - Interacción con dispositivos

## 🔧 Principio de Polimorfismo

### **Ejemplo en el Controlador:**
```java
private void ejecutarProcesos() {
    for(Procesos proceso : listaProcesos) {
        String resultado = proceso.ejecutar(); // ← Polimorfismo
        vista.mostrarResultado(resultado);
    }
}
```

**El planificador ejecuta todos los procesos de manera uniforme sin conocer sus tipos específicos.**

## 🚀 Cómo Ejecutar

1. Compilar todos los archivos .java:
```bash
javac *.java
```

2. Ejecutar la aplicación:
```bash
java Main
```

## 📝 Características Técnicas

- **Lenguaje**: Java
- **Paradigma**: Orientado a Objetos
- **Patrón**: MVC (Modelo-Vista-Controlador)
- **Principios SOLID aplicados**: 
  - Single Responsibility
  - Open/Closed Principle
  - Liskov Substitution

## 🎓 Aprendizajes Demostrados

1. **Herencia y Polimorfismo**
2. **Patrón MVC en la práctica**
3. **Encapsulamiento y abstracción**
4. **Manejo de listas y colecciones**
5. **Separación entre lógica e interfaz de usuario**

## 🔄 Flujo de Ejecución

1. **Inicialización** → Main crea Controlador
2. **Menú** → Vista muestra opciones al usuario
3. **Agregar** → Usuario proporciona datos del proceso
4. **Ejecutar** → Controlador ejecuta procesos polimórficamente
5. **Resultados** → Cada proceso muestra su comportamiento específico

---

*Desarrollado como ejercicio académico para demostrar polimorfismo en Java*
(README creado con AI)
