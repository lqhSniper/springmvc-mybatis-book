package com.ay.model_auto;

public class AyUserDao {
    private Long id;

    private String name;

    private String password;

    private Integer age;

    private Long addressId;

    public AyUserDao(Long id, String name, String password, Integer age, Long addressId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.addressId = addressId;
    }

    public AyUserDao() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}