/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
/**
 *
 * @author vagishadeo
 */
public class Profile {
    
    private String name;
    private String geo_data;
    private String dob; 
    private String tele;
    private String fax;  
    private String email;
    private String ssn;
    private String  media;
    private String  health;
    private String bank_details;
    private String license_number;
    private String vehicle_data;
    private String decice_data;
    private String linkedin;
    private String protocol;
    private String biometric;
    private String photo;
    private String unique_identify;
    
    public String getName() {
        return name;
       
    }

    public void setName(String name) {
        this.name = name;
        
    }

    public String getGeo_data() {
        return geo_data;
    }

    public void setGeo_data(String geo_data) {
        this.geo_data = geo_data;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getBank_details() {
        return bank_details;
    }

    public void setBank_details(String bank_details) {
        this.bank_details = bank_details;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getVehicle_data() {
        return vehicle_data;
    }

    public void setVehicle_data(String vehicle_data) {
        this.vehicle_data = vehicle_data;
    }

    public String getDecice_data() {
        return decice_data;
    }

    public void setDecice_data(String decice_data) {
        this.decice_data = decice_data;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getBiometric() {
        return biometric;
    }

    public void setBiometric(String biometric) {
        this.biometric = biometric;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUnique_identify() {
        return unique_identify;
    }

    public void setUnique_identify(String unique_identify) {
        this.unique_identify = unique_identify;
    }

    
}
