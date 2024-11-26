package com.hib3.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Passport implements Serializable {
    private int passportNo;
    private String passportHName;
    private LocalDate issueDt;
    private LocalDate expiryDt;
    private String issueAutho;

    public int getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(int passportNo) {
        this.passportNo = passportNo;
    }

    public String getPassportHName() {
        return passportHName;
    }

    public void setPassportHName(String passportHName) {
        this.passportHName = passportHName;
    }

    public LocalDate getIssueDt() {
        return issueDt;
    }

    public void setIssueDt(LocalDate issueDt) {
        this.issueDt = issueDt;
    }

    public LocalDate getExpiryDt() {
        return expiryDt;
    }

    public void setExpiryDt(LocalDate expiryDt) {
        this.expiryDt = expiryDt;
    }

    public String getIssueAutho() {
        return issueAutho;
    }

    public void setIssueAutho(String issueAutho) {
        this.issueAutho = issueAutho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNo == passport.passportNo && Objects.equals(passportHName, passport.passportHName) && Objects.equals(issueDt, passport.issueDt) && Objects.equals(expiryDt, passport.expiryDt) && Objects.equals(issueAutho, passport.issueAutho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNo, passportHName, issueDt, expiryDt, issueAutho);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNo=" + passportNo +
                ", passportHName='" + passportHName + '\'' +
                ", issueDt=" + issueDt +
                ", expiryDt=" + expiryDt +
                ", issueAutho='" + issueAutho + '\'' +
                '}';
    }
}
