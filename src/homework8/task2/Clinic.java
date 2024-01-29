package homework8.task2;

public class Clinic {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        patient1.treatOfPatient(TreatmentPlan.CODE4);
        patient2.treatOfPatient(TreatmentPlan.CODE2);
    }
}
