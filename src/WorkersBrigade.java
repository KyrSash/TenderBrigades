import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class WorkersBrigade {
    private final HashSet<ConstructionWorker> listWorkers = new HashSet<>();

    public HashSet<ConstructionWorker> getListWorkers() {
        return listWorkers;
    }

    public void addConstructionWorker(ConstructionWorker constructionWorker) {
        this.listWorkers.add(constructionWorker);
    }

    public ArrayList<ProfessionalSkills> getWorkersBrigadeProfessions() {
        ArrayList<ProfessionalSkills> buildersBrigadeProfessions = new ArrayList<>();
        for (ConstructionWorker constructionWorker : listWorkers) {
            buildersBrigadeProfessions.addAll(constructionWorker.getWorkerProfessionalSkillsSet());
        }
        return buildersBrigadeProfessions;
    }

    public double getWorkersBrigadeSalary() {
        double summa = 0;
        for (ConstructionWorker constructionWorker : listWorkers) {
            summa += constructionWorker.getSalary();
        }
        return summa;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof WorkersBrigade)) return false;
        WorkersBrigade that = (WorkersBrigade) object;
        return getListWorkers().equals(that.getListWorkers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListWorkers());
    }

    @Override
    public String toString() {
        return "BuildersBrigade{" +
                "listBuilders=" + listWorkers +
                '}';
    }
}
