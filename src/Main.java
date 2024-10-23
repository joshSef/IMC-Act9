public class Main {
    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente("Joshua Espinosa", 1.79, 90.35);
            String resultadoIMC = paciente.IMC();
            System.out.println(resultadoIMC);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}