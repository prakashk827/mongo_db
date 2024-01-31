package com.wdu.productservice.profile.dto;

public class ContactDTO {

    private String country;
    private String address;
    private String phone;
    private String email;
    private String twitterURL;
    private String facebookURL;
    private String instagramURL;
    private String linkedlnURL;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitterURL() {
        return twitterURL;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
    }

    public String getFacebookURL() {
        return facebookURL;
    }

    public void setFacebookURL(String facebookURL) {
        this.facebookURL = facebookURL;
    }

    public String getInstagramURL() {
        return instagramURL;
    }

    public void setInstagramURL(String instagramURL) {
        this.instagramURL = instagramURL;
    }

    public String getLinkedlnURL() {
        return linkedlnURL;
    }

    public void setLinkedlnURL(String linkedlnURL) {
        this.linkedlnURL = linkedlnURL;
    }
}
