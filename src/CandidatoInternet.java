public class CandidatoInternet extends  Candidato {
    private static final double costoInternet = 700000;

    public CandidatoInternet(String nombre) {
        super(nombre);
    }
    public void votar(int medioSeleccionado){
        super.votar(medioSeleccionado, costoInternet);
    }


}
