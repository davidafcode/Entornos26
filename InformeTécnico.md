# Informe Técnico de BuggyWebApp

## Descripción del problema
El **formulario** se envía a pesar de que la validación debería bloquear el procesado, debido a que el campo de **nombre** e **email** están vacíos.

## Análisis técnico
1. La clase `ContactService`, que utiliza la clase `Validator` para comprobar que el email contiene un caracter `@`, permite procesar el formulario a pesar de no haberse validado el email, ya que el procesamiento se encuentra fuera del `if()`.

2. Además, en la clase `Validator` tampoco se comprueba que el **nombre** no esté vacío.

3. Por último, se debería mostrar en la consola un mensaje de error cuando `validateEmail` o `validateName` (nueva función que se debe añadir) devuelvan `false`.

## Raíz del Problema
La validación del programa no es efectiva y debe ser reformulada.

## Propuesta de solución
1. Añadir validación del nombre en la clase `Validator`.
2. Evitar que se procese el **formulario** si la validación es `false`.
3. Añadir mensaje de error si no se puede procesar el **formulario**.
