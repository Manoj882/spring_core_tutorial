package injectingReferenceType;

public class Employee {
    private int empId;
    private String empName;
    private Certificate cert;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Certificate getCert() {
        return cert;
    }

    public void setCert(Certificate cert) {
        this.cert = cert;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", cert=" + cert +
                '}';
    }
}
