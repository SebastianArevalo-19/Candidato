public class CandidatoRadio extends  Candidato {
    private static final double costoRadio = 200000;

    public CandidatoRadio(String nombre) {
        super(nombre);
    }
    public void votar(int medioSeleccionado){
        super.votar(medioSeleccionado, costoRadio);
    }
}
