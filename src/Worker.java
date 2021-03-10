import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Worker {
    private double salary;
    private Set<ProfessionalSkills> workerProfessionalSkillsSet = new HashSet<>();

    public Worker() {
    }

    public Worker(double salary, Set<ProfessionalSkills> workerProfessionalSkillsSet) {
        this.salary = salary;
        this.workerProfessionalSkillsSet = workerProfessionalSkillsSet;
    }

    public double getSalary() {
        return salary;
    }

    public Set<ProfessionalSkills> getWorkerProfessionalSkillsSet() {
        return workerProfessionalSkillsSet;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkerProfessionalSkillsSet(HashSet<ProfessionalSkills> workerProfessionalSkillsSet) {
        this.workerProfessionalSkillsSet = workerProfessionalSkillsSet;
    }

    public void addProfessionalSkill(ProfessionalSkills professionalSkill) {
        workerProfessionalSkillsSet.add(professionalSkill);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Worker that = (Worker) object;
        return Double.compare(that.salary, salary) == 0 && workerProfessionalSkillsSet.equals(that.workerProfessionalSkillsSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, workerProfessionalSkillsSet);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", workerProfessionalSkillsSet=" + workerProfessionalSkillsSet +
                '}';
    }
}
