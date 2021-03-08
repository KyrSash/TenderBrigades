import java.util.HashSet;
import java.util.Objects;

public class ConstructionWorker {
    private double salary;
    private HashSet<ProfessionalSkills> workerProfessionalSkillsSet = new HashSet<>();

    public ConstructionWorker() {
    }

    public ConstructionWorker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public HashSet<ProfessionalSkills> getWorkerProfessionalSkillsSet() {
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
        ConstructionWorker that = (ConstructionWorker) object;
        return Double.compare(that.salary, salary) == 0 && workerProfessionalSkillsSet.equals(that.workerProfessionalSkillsSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, workerProfessionalSkillsSet);
    }

    @Override
    public String toString() {
        return "ConstructionWorker{" +
                "salary=" + salary +
                ", workerProfessionalSkillsSet=" + workerProfessionalSkillsSet +
                '}';
    }
}
