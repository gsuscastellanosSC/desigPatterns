# Contenido tomado de  [refactoring.guru](https://refactoring.guru/design-patterns.)
# 馃毃<a href="https://refactoring.guru/design-patterns" target="_blank">Desig Patterns</a>馃毃
## 鉁匔reational patterns鈿★笍
  ``Estos patrones proporcionan varios mecanismos de creaci贸n de objetos, que aumentan la flexibilidad y la reutilizaci贸n del c贸digo existente.``

1锔忊儯 Factory Method鈿★笍
  
  ``Tambi茅n conocido como: Constructor virtual``

    Es un patr贸n de dise帽o creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crear谩n.

![https://refactoring.guru/design-patterns/factory-method](https://refactoring.guru/images/patterns/content/factory-method/factory-method-en.png)

    馃敟 Problema
    
    Imagine que est谩 creando una aplicaci贸n de gesti贸n log铆stica. La primera versi贸n de su aplicaci贸n solo puede manejar el trasporte en camiones, por lo que la mayor parte de su c贸digo vive dentro de la Truck clase.

    Despu茅s de un tiempo, su aplicaci贸n se vuelve bastante popular. Cada d铆a recibe decenas de solicitudes de empresas de transporte mar铆timo para incorporar la log铆stica mar铆tima en la aplicaci贸n.

![[This is an image](https://refactoring.guru/design-patterns/factory-method)](https://refactoring.guru/images/patterns/diagrams/factory-method/problem1-en.png)

    Agregar una nueva clase al programa no ser谩 simple si el resto del c贸digo est谩 acoplado a las clases existentes.

    Las mayor parte del c贸digo esta acoplado a la Truck clase. Agregar Ships a la aplicaci贸n requerir谩 cambios en todo el c贸digo base. Ademas, si luego se agrega otro tipo de transporte es probable que se deben hacer la igual cantidad de cambios.

    Por lo que el resultado final sera un c贸digo desagradable, con un gran n煤mero de condicionales que cambian el comportamiento de la aplicaci贸n seg煤n el tipo de transporte.``

    馃挕 Soluci贸n

    El patr贸n Factory Method sugiere que remplace las llamadas directas de construcci贸n de objetos(usando el operador new) con llamadas a un Factory Method especial. Los objetos se siguen creando con el operador new pero se llama desde el Factory Method, a estos objetos a menudo se les denomina productos.
            
![https://refactoring.guru/design-patterns/factory-method](https://refactoring.guru/images/patterns/diagrams/factory-method/solution1.png)
## 鉁匰tructural patterns鈿★笍
``Estos patrones explican c贸mo ensamblar objetos y clases en estructuras m谩s grandes manteniendo estas estructuras flexibles y eficientes.``
## 鉁匓ehavioral patterns鈿★笍
``Estos patrones est谩n relacionados con algoritmos y la asignaci贸n de responsabilidades entre objetos.``
## 馃毀Links馃搶
 * 馃搫 [refactoring.guru](https://refactoring.guru/design-patterns.)
 * 馃搫 <a href="https://yaytext.com" target="_blank">yaytext.</a>