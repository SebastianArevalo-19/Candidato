import java.util.ArrayList;
import java.util.List;
public class Votacion {
    private List<Candidato>candidatoes;

    public Votacion() {
        candidatoes = new ArrayList<>();
        candidatoes.add(new CandidatoInternet("Candidato 1"));
        candidatoes.add(new CandidatoRadio("Candidato 2"));
        candidatoes.add(new CandidatoTelevision("Candidato 3"));
    }
}
