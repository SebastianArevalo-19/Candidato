public class Candidato {
    private String nombre;
    private double costoCampana;
    private int votos;

    public Candidato(String nombre) {
        this.nombre = nombre;
        this.costoCampana = 0;
        this.votos = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoCampana() {
        return costoCampana;
    }
    public void setCostoCampana(double costoCampana) {
        this.costoCampana = costoCampana;
    }
    public int getVotos() {
        return votos;
    }
    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nombre='" + nombre + '\'' +
                ", costoCampana=" + costoCampana +
                ", votos=" + votos +
                '}';
    }
    public void votar(int medioSeleccionado,double costo){
        this.costoCampana += costo;
        this.votos++;
    }
}
