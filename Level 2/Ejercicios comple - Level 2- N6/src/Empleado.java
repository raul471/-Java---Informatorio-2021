public class Empleado {

        int hTrabajadas;
        int vPHora;
        String nom;
        String apell;
        String DNI;


        public Empleado(int hTrabajadas, int vPHora, String nom, String apell, String DNI){
            this.DNI = DNI;
            this.hTrabajadas = hTrabajadas;
            this.vPHora = vPHora;
            this.apell = apell;
            this.nom = nom;
        }
        @Override
        public String toString() {
            return this.nom + " " + this.apell;
        }

}
