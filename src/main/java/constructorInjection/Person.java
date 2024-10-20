package constructorInjection;

import java.util.List;

public class Person {

    private int personId;
    private  String personName;
    private List<String> phone;
    private  Certificate certificate;

    public Person(int personId, String personName, List<String> phone, Certificate certificate) {
        this.personId = personId;
        this.personName = personName;
        this.phone = phone;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", phone=" + phone +
                ", certificate=" + certificate +
                '}';
    }
}
