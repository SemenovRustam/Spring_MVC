package com.RustamSemenov.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private  String name;
    private  String surname;
    private  int salary;
    private String department;
    private  String carBrand;

    private Map<String,String> departmens;
    private Map<String,String> carBrands;
    private String [] leanguages;
    private Map <String, String > list;

    public Employee() {
        departmens = new HashMap<>();
        departmens.put("IT", "Information technology");
        departmens.put("Sales", "Sales");
        departmens.put("HR", "Human resources");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes-Benz");

        list = new HashMap<>();
        list.put("English", "EN");
        list.put("Deutch", "DE");
        list.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;


    }

    public Map<String, String> getDepartmens() {
        return departmens;
    }

    public void setDepartmens(Map<String, String> departmens) {
        this.departmens = departmens;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLeanguages() {
        return leanguages;
    }

    public void setLeanguages(String[] leanguages) {
        this.leanguages = leanguages;
    }

    public Map<String, String> getList() {
        return list;
    }

    public void setList(Map<String, String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
