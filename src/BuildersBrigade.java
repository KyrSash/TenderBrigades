import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class BuildersBrigade {
    private final HashSet<ConstructionWorker> listBuilders = new HashSet<>();

    public HashSet<ConstructionWorker> getListBuilders() {
        return listBuilders;
    }

    public void addConstructionWorker(ConstructionWorker constructionWorker) {
        this.listBuilders.add(constructionWorker);
    }

    public ArrayList<ProfessionalSkills> getBuildersBrigadeProfessions() {
        ArrayList<ProfessionalSkills> buildersBrigadeProfessions = new ArrayList<>();
        for (ConstructionWorker constructionWorker : listBuilders) {
            buildersBrigadeProfessions.addAll(constructionWorker.getWorkerProfessionalSkillsSet());
        }
        return buildersBrigadeProfessions;
    }

    public double getBuildersBrigadeSalary() {
        double summa = 0;
        for (ConstructionWorker constructionWorker : listBuilders) {
            summa += constructionWorker.getSalary();
        }
        return summa;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BuildersBrigade)) return false;
        BuildersBrigade that = (BuildersBrigade) object;
        return getListBuilders().equals(that.getListBuilders());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListBuilders());
    }

    @Override
    public String toString() {
        return "BuildersBrigade{" +
                "listBuilders=" + listBuilders +
                '}';
    }
}
