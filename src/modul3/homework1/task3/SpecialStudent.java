package modul3.homework1.task3;

public class SpecialStudent extends CollegeStudent  {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey, String email) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id, long secretKey, String email) {
        super(lastName, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
