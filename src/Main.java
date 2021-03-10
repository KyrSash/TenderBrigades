public class Main {
    public static void main(String[] args) {
        Worker smu1 = new Worker();
        smu1.addProfessionalSkill(ProfessionalSkills.CARPENTER);
        smu1.addProfessionalSkill(ProfessionalSkills.CRANE_OPERATOR);
        smu1.setSalary(100.1);
        Worker smu2 = new Worker();
        smu2.addProfessionalSkill(ProfessionalSkills.CRANE_OPERATOR);
        smu2.setSalary(100.1);
        Worker smu3 = new Worker();
        smu3.addProfessionalSkill(ProfessionalSkills.CIVIL_ENGINEER);
        smu3.setSalary(100.1);

        Worker zao1 = new Worker();
        zao1.addProfessionalSkill(ProfessionalSkills.CARPENTER);
        zao1.addProfessionalSkill(ProfessionalSkills.CRANE_OPERATOR);
        zao1.setSalary(50.1);
        Worker zao2 = new Worker();
        zao2.addProfessionalSkill(ProfessionalSkills.CRANE_OPERATOR);
        zao2.setSalary(100.1);
        Worker zao3 = new Worker();
        zao3.addProfessionalSkill(ProfessionalSkills.CIVIL_ENGINEER);
        zao3.setSalary(100.1);

        Worker yks1 = new Worker();
        yks1.addProfessionalSkill(ProfessionalSkills.CONCRETE_WORKER);
        yks1.setSalary(100.1);
        Worker yks2 = new Worker();
        yks2.addProfessionalSkill(ProfessionalSkills.CONCRETE_WORKER);
        yks2.setSalary(100.1);
        Worker yks3 = new Worker();
        yks3.addProfessionalSkill(ProfessionalSkills.CONCRETE_WORKER);
        yks3.setSalary(100.1);

        WorkersBrigade smu = new WorkersBrigade();
        smu.addWorker(smu1);
        smu.addWorker(smu2);
        smu.addWorker(smu3);

        WorkersBrigade zao = new WorkersBrigade();
        zao.addWorker(zao1);
        zao.addWorker(zao2);
        zao.addWorker(zao3);

        WorkersBrigade yks = new WorkersBrigade();
        yks.addWorker(yks1);
        yks.addWorker(yks2);
        yks.addWorker(yks3);

        Tender tender = new Tender();
        tender.addProfessionalSkillsTender(ProfessionalSkills.CARPENTER, 1);
        tender.addProfessionalSkillsTender(ProfessionalSkills.CRANE_OPERATOR, 2);
        tender.addProfessionalSkillsTender(ProfessionalSkills.CIVIL_ENGINEER, 1);

        tender.addWorkersBrigadeToTender(smu);
        tender.addWorkersBrigadeToTender(zao);
        tender.addWorkersBrigadeToTender(yks);

        System.out.println(tender.selectionBestSuitableBrigade());

    }
}
