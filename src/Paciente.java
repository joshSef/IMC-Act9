public class Paciente {
        private String nombre;
        private double altura; // en M
        private double peso;   // en Kg

        public Paciente(String nombre, double altura, double peso) {
            this.nombre = nombre;
            this.altura = altura;
            this.peso = peso;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public String IMC() {
            if (altura <= 0) {
                throw new IllegalArgumentException("La altura debe ser mayor que cero.");
            }
            double imc = peso / (altura * altura);
            if (imc < 18.5) {
                return "Bajo peso: IMC = " + imc;
            } else if (imc < 24.9) {
                return "Peso normal: IMC = " + imc;
            } else if (imc < 29.9) {
                return "Sobrepeso: IMC = " + imc;
            } else {
                return "Obesidad: IMC = " + imc;
            }
        }
    }
