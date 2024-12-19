package OOP_assignment1;
public class Program {
    public static void main(String[] args) {
        // Creating instances of classes
        Patient patient1 = new Patient("John Doe", 30, "A12345");
        Patient patient2 = new Patient("Jane Smith", 28, "B67890");

        MedicalProfessional doctor = new MedicalProfessional("Dr. Alice", "Cardiologist", 15);

        Hospital hospital = new Hospital("City Hospital", "123 Main Street", 100);

        // Outputting instances to console
        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(doctor);
        System.out.println(hospital);

        // Comparing multiple objects
        System.out.println("Are patients the same? " + patient1.equals(patient2));
    }
}

class Patient {
    private String name;
    private int age;
    private String patientId;

    // Constructor
    public Patient(String name, int age, String patientId) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // toString Method
    @Override
    public String toString() {
        return "Patient[name=" + name + ", age=" + age + ", patientId=" + patientId + "]";
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient patient = (Patient) obj;
        return patientId.equals(patient.patientId);
    }
}

class MedicalProfessional {
    private String name;
    private String specialty;
    private int yearsOfExperience;

    // Constructor
    public MedicalProfessional(String name, String specialty, int yearsOfExperience) {
        this.name = name;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    // toString Method
    @Override
    public String toString() {
        return "MedicalProfessional[name=" + name + ", specialty=" + specialty + ", yearsOfExperience=" + yearsOfExperience + "]";
    }
}

class Hospital {
    private String name;
    private String address;
    private int capacity;

    // Constructor
    public Hospital(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // toString Method
    @Override
    public String toString() {
        return "Hospital[name=" + name + ", address=" + address + ", capacity=" + capacity + "]";
    }
}
