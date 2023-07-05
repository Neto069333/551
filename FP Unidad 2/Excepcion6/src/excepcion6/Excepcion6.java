public class Excepcion6 {

    public static class NumerosNullException extends Exception {
        public NumerosNullException(String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        Integer numero1 = null;
        Integer numero2 = 5;

        try {
            if (numero1 == null || numero2 == null) {
                throw new NumerosNullException("Error: Uno o ambos números son nulos.");
            }

            Integer resultado = numero1 + numero2;

            System.out.println("El resultado de la suma es: " + resultado);
        } catch (NumerosNullException e) {
            System.out.println(e.getMessage());
        }
    }
}
