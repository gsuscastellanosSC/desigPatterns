# Contenido tomado de  [refactoring.guru](https://refactoring.guru/design-patterns.)
# 🚨<a href="https://refactoring.guru/design-patterns" target="_blank">Desig Patterns</a>🚨
## ✅Creational patterns⚡️
  ``Estos patrones proporcionan varios mecanismos de creación de objetos, que aumentan la flexibilidad y la reutilización del código existente.``

1️⃣ Factory Method⚡️
  
  ``También conocido como: Constructor virtual``

    Es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán.

![https://refactoring.guru/design-patterns/factory-method](https://refactoring.guru/images/patterns/content/factory-method/factory-method-en.png)

    🔥 Problema
    
    Imagine que está creando una aplicación de gestión logística. La primera versión de su aplicación solo puede manejar el trasporte en camiones, por lo que la mayor parte de su código vive dentro de la Truck clase.

    Después de un tiempo, su aplicación se vuelve bastante popular. Cada día recibe decenas de solicitudes de empresas de transporte marítimo para incorporar la logística marítima en la aplicación.

![[This is an image](https://refactoring.guru/design-patterns/factory-method)](https://refactoring.guru/images/patterns/diagrams/factory-method/problem1-en.png)

    Agregar una nueva clase al programa no será simple si el resto del código está acoplado a las clases existentes.

    Las mayor parte del código esta acoplado a la Truck clase. Agregar Ships a la aplicación requerirá cambios en todo el código base. Ademas, si luego se agrega otro tipo de transporte es probable que se deben hacer la igual cantidad de cambios.

    Por lo que el resultado final sera un código desagradable, con un gran número de condicionales que cambian el comportamiento de la aplicación según el tipo de transporte.``

    💡 Solución

    El patrón Factory Method sugiere que remplace las llamadas directas de construcción de objetos(usando el operador new) con llamadas a un Factory Method especial. Los objetos se siguen creando con el operador new pero se llama desde el Factory Method, a estos objetos a menudo se les denomina productos.
            
![https://refactoring.guru/design-patterns/factory-method](https://refactoring.guru/images/patterns/diagrams/factory-method/solution1.png)
## ✅Structural patterns⚡️
``Estos patrones explican cómo ensamblar objetos y clases en estructuras más grandes manteniendo estas estructuras flexibles y eficientes.``
## ✅Behavioral patterns⚡️
``Estos patrones están relacionados con algoritmos y la asignación de responsabilidades entre objetos.``
## 🚧Links📌
 * 📄 [refactoring.guru](https://refactoring.guru/design-patterns.)
 * 📄 <a href="https://yaytext.com" target="_blank">yaytext.</a>