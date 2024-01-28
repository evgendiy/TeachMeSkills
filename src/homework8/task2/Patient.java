package homework8.task2;

public class Patient {

    void treatOfPatient(TreatmentPlan code) {
        if (code == TreatmentPlan.CODE1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (code == TreatmentPlan.CODE2) {
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}
