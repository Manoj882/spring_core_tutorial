package constructorInjection;

public class Certificate {
    private  int certId;
    private  String certName;

    public Certificate(int certId, String certName) {
        super();
        this.certId = certId;
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
