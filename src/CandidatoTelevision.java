public class CandidatoTelevision  extends  Candidato{
    private static final  double costoTelevesion = 600000;

    public CandidatoTelevision(String nombre) {
        super(nombre);
    }
    public void votar(int medioSeleccionado){
        super.votar(medioSeleccionado, costoTelevesion);
    }
}
