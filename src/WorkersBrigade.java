import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class WorkersBrigade {
    private final HashSet<Worker> listWorkers = new HashSet<>();

    public HashSet<Worker> getListWorkers() {
        return listWorkers;
    }

    public void addWorker(Worker worker) {
        this.listWorkers.add(worker);
    }

    public double getWorkersBrigadeSalary() {
        double summa = 0;
        for (Worker worker : listWorkers) {
            summa += worker.getSalary();
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