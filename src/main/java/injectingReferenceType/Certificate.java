package injectingReferenceType;

public class Certificate {
    private int certId;
    private String certName;

    public int getCertId() {
        return certId;
    }

    public void setCertId(int certId) {
        this.certId = certId;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certId=" + certId +
                ", certName='" + certName + '\'' +
                '}';
    }
}
