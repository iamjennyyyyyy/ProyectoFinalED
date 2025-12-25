# 🏥 Sistema de Vigilancia Epidemiológica - La Habana

## 📌 **Información del Proyecto**
**Proyecto Final** de la asignatura **Estructuras de Datos**  
**Equipo:** 3 desarrolladores  
**Tutor:** Omar 
**Fecha de inicio:** 17/11/2025  
**Estado:** En fase de modelación y diseño  

## 👥 **Equipo de Desarrollo**
| Rol | Nombre | Responsabilidades |
|-----|--------|-------------------|
| **Desarrolladora** | Nicole | Modelación de dominio, lógica de negocio |
| **Desarrolladora** | Jennifer | Diagramas, estructura de datos, interfaz |
| **Desarrollador** | Dariel | Implementación, funcionalidades principales |
| **Tutor/Asesor** | Omar | Guía, revisión técnica, coordinación |

## 🎯 **Objetivo del Sistema**
Desarrollar un sistema que permita la **detección temprana de epidemias** en la provincia de La Habana mediante:
- Modelación de la **estructura jerárquica del sistema de salud cubano**
- Registro de atenciones médicas y diagnósticos
- Análisis de incidencia de enfermedades por **consejos populares**
- Generación de reportes para identificación de brotes

## 📊 **Requisitos Académicos**
### Contexto de la Asignatura
- **Tarea final:** Desarrollar un proyecto que utilice **árboles o grafos**
- **Formato original:** Crear un juego en equipos de 7 personas
- **Nuestra adaptación:** Transformamos el concepto a un **sistema de vigilancia epidemiológica**
- **Condición:** Implementar al menos **una estructura de árbol o grafo** correctamente

### Nuestro Enfoque
✅ **Árbol:** Para modelar la jerarquía del sistema de salud  
✅ **Grafo:** Para modelar relaciones entre consejos populares

## 🏗️ **Arquitectura del Sistema**

### **1. Modelo de Dominio**
```
Entidades Principales:
├── MINSAP (nivel nacional)
├── Dirección Provincial
├── Dirección Municipal
├── Policlínico (Área de Salud)
├── Consultorio
├── Consejo Popular
├── Médico
├── Enfermedad
└── (Paciente - fase futura)
```

### **2. Estructura Jerárquica (Árbol)**
```
Sistema de Salud Cubano:
MINSAP
└── Dirección Provincial de Salud - La Habana
    └── Dirección Municipal (15 municipios)
        └── Policlínico (1 por área de salud)
            └── Consultorio Médico
```

### **3. Estructura Territorial (Grafo)**
- **Nodos:** Consejos Populares de la provincia
- **Aristas:** Conexiones territoriales/geográficas
- **Propósito:** Analizar propagación entre zonas vecinas

## 🔧 **Funcionalidades Principales**

### **Para Médicos**
- Registrar atenciones médicas
- Especificar diagnóstico (enfermedad)
- Asociar paciente a consejo popular

### **Para Administradores**
- Visualizar estructura completa del sistema de salud
- Consultar estadísticas por:
  - Enfermedad
  - Municipio
  - Consejo Popular
  - Período de tiempo
- Generar reportes de posibles brotes

### **Análisis Automático**
- Conteo de casos por consejo popular
- Detección de incrementos anómalos
- Alertas tempranas de posibles epidemias

## 💻 **Stack Tecnológico**
- **Lenguaje:** Java
- **Estructuras de Datos:**
  - Árbol n-ario para jerarquía organizacional
  - Grafo para relaciones territoriales
  - Listas y colecciones para gestión de datos
- **Interfaz:** Swing/JavaFX (similar a proyectos DPOO)
- **Persistencia:** Archivos JSON/XML o base de datos simple

## 📅 **Cronograma y Estado Actual**

### **Fases Completadas**
1. ✅ Definición del proyecto (17/11/2025)
2. ✅ Investigación del sistema de salud cubano
3. ✅ Decisión sobre actores (Médico y Administrador)
4. ✅ Clarificación de estructura árbol vs grafo

### **Próximos Pasos (Prioritarios)**
2. **Diagrama del Árbol** jerárquico
3. **Ejemplo del Grafo** de consejos populares

### **Pendientes por Definir**
- Atributos específicos de cada entidad
- Formatos de reportes y visualizaciones

## ❓ **Decisiones de Diseño Clave**

### **1. Exclusión del Paciente (por ahora)**
- **Decisión:** No modelar entidad Paciente en fase inicial
- **Razón:** Simplificar modelo, enfocarnos en estructura y análisis
- **Alternativa:** Registrar "casos" asociados a consejos populares

### **2. Árbol vs Grafo**
- **Árbol:** Estructura jerárquica fija del sistema de salud
- **Grafo:** Relaciones flexibles entre consejos populares
- **Ventaja:** Cumplimos requisito usando ambas estructuras

### **3. Niveles de la Jerarquía**
```
Confirmado:
Provincia → Municipio → Policlínico → Consultorio

En discusión:
Dónde ubicar los Consejos Populares:
- Opción A: Como hijos de Policlínicos
- Opción B: Como estructura paralela (grafo)
```

## 📁 **Organización del Repositorio**
```
/proyecto-epidemiologia/
├── /src/                    # Código fuente Java
│   ├── /model/             # Entidades del dominio
│   ├── /structures/        # Árbol y Grafo personalizados
│   ├── /logic/             # Lógica de negocio
│   └── /ui/                # Interfaz de usuario
├── /docs/                  # Documentación
│   ├── diagramas/          # UML, árbol, grafo
│   └── investigacion/      # Sistema de salud cubano
├── /data/                  # Datos de ejemplo
└── README.md               # Este archivo
```

## 🚨 **Desafíos Técnicos Identificados**

### **1. Modelación del Sistema de Salud**
- Necesidad de validar con personal médico real
- Posibles cambios en la estructura organizativa

### **2. Relación Geográfica**
- Un policlínico puede atender múltiples consejos populares
- Múltiples consultorios pueden pertenecer a un mismo consejo

### **3. Escalabilidad**
- La Habana tiene ~15 municipios, 100+ consejos populares
- Sistema debe manejar miles de registros eficientemente

## ✅ **Criterios de Éxito**

### **Académicos**
- [ ] Implementar correctamente estructura de árbol
- [ ] Implementar correctamente estructura de grafo
- [ ] Interfaz funcional que visualice información
- [ ] Código limpio y documentado

### **Funcionales**
- [ ] Registrar atenciones médicas
- [ ] Asociar casos a consejos populares
- [ ] Generar reportes básicos
- [ ] Detectar incrementos anómalos

> *"Identificar posibles epidemias en los consejos populares mediante el análisis de datos de atención médica."* - Objetivo principal definido por el equipo
