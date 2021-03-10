import java.util.*;

public class Tender {
    private final Map<ProfessionalSkills, Integer> skills = new HashMap<>();
    private final List<WorkersBrigade> tenderWorkersBrigade = new ArrayList<>();

    public Map<ProfessionalSkills, Integer> getSkills() {
        return skills;
    }

    public List<WorkersBrigade> getTenderWorkersBrigade() {
        return tenderWorkersBrigade;
    }

    public void addProfessionalSkillsTender(ProfessionalSkills professionalSkills, Integer numberOfSkills) {
        this.skills.put(professionalSkills, numberOfSkills);
    }

    public void addWorkersBrigadeToTender(WorkersBrigade workersBrigade) {
        this.tenderWorkersBrigade.add(workersBrigade);
    }

    private boolean checkingSkillMatchesInBrigade(WorkersBrigade workersBrigade) {
        boolean checkSkillInBrigade = false;
        for (ProfessionalSkills professionalSkills : skills.keySet()) {
            Integer numberSkills = skills.get(professionalSkills);
            int skillsCount = 0;
            for (Worker worker : workersBrigade.getListWorkers()) {
                if (worker.getWorkerProfessionalSkillsSet().contains(professionalSkills)) {
                    skillsCount++;
                }
            }
            if (skillsCount < numberSkills) {
                return false;
            } else checkSkillInBrigade = true;
        }
        return checkSkillInBrigade;
    }

    private void removalUnsuitableBrigade() {
        tenderWorkersBrigade.removeIf(workersBrigade -> !checkingSkillMatchesInBrigade(workersBrigade));
    }

    public WorkersBrigade selectionBestSuitableBrigade() {
        removalUnsuitableBrigade();
        tenderWorkersBrigade.sort(Comparator.comparing(WorkersBrigade::getWorkersBrigadeSalary));
        return tenderWorkersBrigade.get(0);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Tender)) return false;
        Tender tender = (Tender) object;
        return getSkills().equals(tender.getSkills()) && getTenderWorkersBrigade().equals(tender.getTenderWorkersBrigade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSkills(), getTenderWorkersBrigade());
    }

    @Override
    public String toString() {
        return "Tender{" +
                "skills=" + skills +
                ", tenderWorkersBrigade=" + tenderWorkersBrigade +
                '}';
    }
}