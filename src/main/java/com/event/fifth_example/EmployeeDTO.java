package com.event.fifth_example;

public class EmployeeDTO {

    private Integer id;
    private String firstName;
    private String lastName;

    public EmployeeDTO() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
