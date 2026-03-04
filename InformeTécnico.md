# Informe Técnico de BuggyWebApp

## Descripción del problema
1. El formulario se encuentra vacío a pesar de añadir al usuario.

2. El formulario se procesa a pesar de que la validación debería bloquear el procesado.

## Análisis técnico
1. El usuario Juan y su email se añaden correctamente al array de la clase UserService. Sin embargo al ejecutar submitContactForm, se usan Strings vacíos en lugar de usar el ítem correcto del array.

2. La clase ContactService, que utiliza la clase Validator para comprobar que el email contiene un "@", permite procesar el formulario a pesar de no haberse validado el email, ya que el procesamiento se encuentra fuera del if().

3. Además, en la clase Validator tampoco se comprueba que el nombre no esté vacío.

4. Por último, se debería mostrar en la consola un mensaje de error cuando validateEmail o validateName (nueva función que se debe añadir) devuelvan falso.

## Raíz del Problema
La validación del programa no es efectiva y debe ser reformulada.

## Propuesta de solución
1. Añadir validación del nombre en la clase Validator.
2. Evitar que se procese el formulario si la validación es falsa.
3. Añadir mensaje de error si no se puede procesar el formulario.
4. Añadir el ítem del array correcto a submitContactForm en lugar de strings vacíos.
