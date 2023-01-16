package com.masai.part2HasArelationship;

import java.util.Objects;

public class Address {

    private String city;
    private String state;
    private String pincode;
    private String type;

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address(String city, String state, String pincode, String type) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(pincode, address.pincode) && Objects.equals(type, address.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, pincode, type);
    }

    public Address() {
    }

    public Address(String city, String state, String pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
