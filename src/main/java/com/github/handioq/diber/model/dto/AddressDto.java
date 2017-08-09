package com.github.handioq.diber.model.dto;

import com.github.handioq.diber.model.entity.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressDto {

    private long id;
    private String name;
    private int postalCode;
    private String country;
    private String city;
    private String region;
    private String address;
    private String phone;

    public AddressDto() {
    }

    public AddressDto(long id, String name, int postalCode, String country, String city, String region, String address, String phone) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
        this.region = region;
        this.address = address;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public static AddressDto fromEntity(Address address) {
        return new AddressDto(address.getId(), address.getName(), address.getPostalCode(), address.getCountry(),
                address.getCity(), address.getRegion(), address.getAddress(), address.getPhone());
    }

    public static List<AddressDto> toDto(List<Address> addresses) {
        List<AddressDto> addressDtos = new ArrayList<>();

        for (Address address : addresses) {
            addressDtos.add(AddressDto.fromEntity(address));
        }

        return addressDtos;
    }

}
