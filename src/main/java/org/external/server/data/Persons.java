package org.external.server.data;

public class Persons {
    private String eMail;
    private String firstName;
    private String lastName;
    private int registrationNumber;
    private String licenceNumber;
    private String date;

    @Override
    public String toString() {
        return "Persons{" +
                "eMail='" + eMail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public Persons(){
    }

    public String getMail() {
        return eMail;
    }

    public void setMail(String eMail) {
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
