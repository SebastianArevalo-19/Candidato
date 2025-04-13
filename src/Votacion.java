import java.util.ArrayList;
import java.util.List;
public class Votacion {
    protected List<Candidato> candidatoes;

    public Votacion() {
        candidatoes = new ArrayList<>();
        candidatoes.add(new CandidatoInternet("Candidato 1"));
        candidatoes.add(new CandidatoRadio("Candidato 2"));
        candidatoes.add(new CandidatoTelevision("Candidato 3"));
    }

    public void votar(int candidatoSeleccionado, int medioSeleccionado) {
        if (candidatoSeleccionado >= 0 && candidatoSeleccionado < candidatoes.size()) {
            double costo = 0;
            switch (medioSeleccionado) {
                case 1:
                    costo = 700000;
                    break;
                case 2:
                    costo = 200000;
                    break;
                case 3:
                    costo = 600000;
                    break;
            }
            candidatoes.get(candidatoSeleccionado).votar(medioSeleccionado, costo);
        }
    }

    public void calcularCostoCampana() {
        double costoTotal = 0;
        for (Candidato candidato : candidatoes) {
            costoTotal += candidato.getCostoCampana();
        }
        double costoPromedio = costoTotal / candidatoes.size();
        System.out.println("Costo promedio camapaña :" + costoPromedio);
    }

    public void vaciarUrnas() {
        for (Candidato candidato : candidatoes) {
            candidato.setVotos(0);
            candidato.setCostoCampana(0);
        }
    }

    public void saberResultados() {
        int totalVotos = 0;
        for (Candidato candidato : candidatoes) {
            totalVotos += candidato.getVotos();
        }
        for (Candidato candidato : candidatoes) {
            double porcentaje = (double) candidato.getVotos() / totalVotos * 100;
            System.out.println(candidato.getNombre() + ":" + candidato.getVotos() + "votos(" + porcentaje + "%)");
        }
    }
}