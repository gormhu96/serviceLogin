++++++++++++++++++++++++++++++++++++++	serviceLogin ++++++++++++++++++++++++++++++++


Un servicio que permite loguearse a los usuarios.

INTRODUCCION
Todos los sistemas internos de una empresa o entidad necesitan de un sistema
login que permita a los usuarios identificarse para visualizar la informacion
necesaria.

DESCRIPCION
Este servicio consta de 2 partes fundamentales, el servicio en si y una base
de datos; el primero fue desarrollado con la ayuda de Spring y la BD fue
desarrollada en MySQL.
Esta aplicación usa la tecnología de contenedores, cada una de las partes fueron
introducidas en los dichos contenedores con el fin de ahorrar recursos entre
otros.

FUNCIONAMIENTO
El servicio se compila en el IDE y la imagen pasa a ser ejecutada en uno de 
los contenedores creados. En el otro contenedor se tiene la BD con todos los
datos necesarios. Se configura el servicio para que pueda hacer la conexión con
la base de datos. Para comprobar el funcionamiento se envía unos datos de prueba
en un formato específico(JSON) lo que debería de devolver un mensaje de conexión
o de error al conectar.

ESPECIFICACIONES ADICIONALES
-Se debe contar con el docker en el host.
-En este proyecto se usó Eclipse con la extensión Spring STS.
-La bd tiene que tener un ID para su identificación.
