package com.example;

public class Student {
    private String id;
    private String name;
    private String dob;
    private String department;
    private int approved;
    
    public Student(String id, String name, String dob, String department, int approved) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.department = department;
        this.approved = approved;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getApproved() { return approved; }
    public void setApproved(int approved) { this.approved = approved; }
}
