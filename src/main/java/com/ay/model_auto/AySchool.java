package com.ay.model_auto;

public class AySchool {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ay_school.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ay_school.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_school
     *
     * @mbg.generated
     */
    public AySchool(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ay_school
     *
     * @mbg.generated
     */
    public AySchool() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ay_school.id
     *
     * @return the value of ay_school.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ay_school.id
     *
     * @param id the value for ay_school.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ay_school.name
     *
     * @return the value of ay_school.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ay_school.name
     *
     * @param name the value for ay_school.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}