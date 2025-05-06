package com.example.session_01;

public class Student {
    private final String name;
    private final String className;
    private final String vehicleType;
    private final String licensePlate;

    public Student(String name, String className, String vehicleType, String licensePlate) {
        this.name = name;
        this.className = className;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
