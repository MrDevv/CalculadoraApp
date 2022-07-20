package aplicacion;

public class Metodos {

    public boolean existeOperador(String operacion) {
        if (operacion.contains("+") || operacion.contains("-") || operacion.contains("x") || operacion.contains("÷") || operacion.contains("%")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existeOperadorAlfinal(String operacion) {
        char operador = operacion.charAt(operacion.length() - 1);

        if (operador == '+' || operador == '-' || operador == 'x' || operador == '÷' || operador == '%') {
            return true;
        }
        return false;
    }

    public String obtenerOperador(String operacion) {
        String operador = "";

        if (operacion.contains("÷")) {
            operador = "÷";
        } else if (operacion.contains("x")) {
            operador = "x";
        } else if (operacion.contains("+")) {
            operador = "+";
        } else if (operacion.contains("%")) {
            operador = "%";
        } else if (operacion.contains("-")) {
            operador = "-";
        } else {
            operador = "no exite";
        }

        return operador;
    }

    public double obtenerResultado(String operador, String operacion) {
        String[] numeros;
        double num1;
        double num2;

        double resultado = 0;

        switch (operador) {
            case "+":
                numeros = operacion.split("\\+");

                num1 = Double.parseDouble(numeros[0]);
                num2 = Double.parseDouble(numeros[1]);

                resultado = num1 + num2;

                break;
            case "-":
                numeros = operacion.split("-");

                if (numeros[0] == "") {
                    num1 = Double.parseDouble(numeros[1]);
                    num2 = Double.parseDouble(numeros[2]);
                    resultado = (-num1 - num2);
                    break;
                }
                num1 = Double.parseDouble(numeros[0]);

                num2 = Double.parseDouble(numeros[1]);

                resultado = num1 - num2;
                break;
            case "x":
                numeros = operacion.split("x");

                num1 = Double.parseDouble(numeros[0]);
                num2 = Double.parseDouble(numeros[1]);

                resultado = num1 * num2;
                break;
            case "÷":
                numeros = operacion.split("÷");

                num1 = Double.parseDouble(numeros[0]);
                num2 = Double.parseDouble(numeros[1]);

                resultado = num1 / num2;
                break;
            case "%":
                numeros = operacion.split("%");

                num1 = Double.parseDouble(numeros[0]);
                num2 = Double.parseDouble(numeros[1]);

                resultado = num1 % num2;
                break;
        }

        return resultado;

    }
}
