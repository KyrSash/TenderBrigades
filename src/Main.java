public class Main {
    public static void main(String[] args) {
        ConstructionWorker constructionWorker = new ConstructionWorker();
        constructionWorker.setSalary(200.2);
        constructionWorker.addProfessionalSkill(ProfessionalSkills.CIVIL_ENGINEER);
        constructionWorker.addProfessionalSkill(ProfessionalSkills.CARPENTER);
        System.out.println(constructionWorker.toString());


    }
}
