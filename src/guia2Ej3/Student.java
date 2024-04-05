package guia2Ej3;

public class Student extends Person{
    private Integer enrollmentYear;
    private Double monthlyQuote;
    private String career;

    public Student(String dni, String name, String surname, String email, String address, Integer enrollmentYear, Double monthlyQuote, String career) {
        super(dni, name, surname, email, address);
        this.enrollmentYear = enrollmentYear;
        this.monthlyQuote = monthlyQuote;
        this.career = career;
    }

    public Integer getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Integer enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Double getMonthlyQuote() {
        return monthlyQuote;
    }

    public void setMonthlyQuote(Double monthlyQuote) {
        this.monthlyQuote = monthlyQuote;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentYear=" + enrollmentYear +
                ", monthlyQuote=" + monthlyQuote +
                ", career='" + career + '\'' +
                '}';
    }
}
