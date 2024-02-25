// Falta importar la clase Trabajador

public class CostePersonal {
    //Creo una constante para las horas extra inicializada a 20
    private static final int TOTAL_HORAS= 20;

    // Método para sumar las horas extras a la nómina.
   private static float calculoHorasExtras(Trabajador trabajador) {
        return trabajador.getNomina() + (trabajador.getHorasExtras() + TOTAL_HORAS);
    }
    static float CosteDelPersonal(Trabajador trabajadores[]) {
        float costeFinal = 0;
        Trabajador trabajador;

        // Se cambia la "y" por la variable "i" 
        for (int i = 0; i < trabajadores.length; i++) {
            trabajador = trabajadores[i];
            if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {

                // Se quita el simbolo de +
                costeFinal = trabajador.getNomina();
            }
            else
            {
                // Se quita el simbolo de + Y se usa el nuevo méto calculoHorasExtra
                costeFinal = calculoHorasExtras(trabajador);
            }
        }
        return costeFinal;
    }
}
