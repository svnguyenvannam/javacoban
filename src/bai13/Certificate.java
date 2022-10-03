package bai13;

import java.util.GregorianCalendar;

public class Certificate {

    private String CertificatedID;
    private String CertificateName;
    private String CertificateRank;
    private GregorianCalendar CertificatedDate;

    public String getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public GregorianCalendar getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(GregorianCalendar certificatedDate) {
        CertificatedDate = certificatedDate;
    }

    Certificate(String CertificatedID, String CertificateName, String CertificateRank, GregorianCalendar CertificatedDate){
        this.CertificatedID = CertificatedID;
        this.CertificateName = CertificateName;
        this.CertificateRank = CertificateRank;
        this.CertificatedDate = CertificatedDate;
    }
}
