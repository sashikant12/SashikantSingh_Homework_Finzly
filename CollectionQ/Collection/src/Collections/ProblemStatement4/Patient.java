package Collections.ProblemStatement4;

public class Patient {
    private String name;
    private int patientId;
    private String disease;

    public Patient() {
    }

    public Patient(int patientId,String name , String disease) {
        this.name = name;
        this.patientId = patientId;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return " PatientId = " + patientId +
                " Name = " + name  +
                " disease = " + disease ;
    }
}
