package com.upgrad.hirewheels.dto;

public class VehicleDTO {

    private int vehicleId;
    private String vehicleModel;
    private String vehicleNumber;
    private int vehicleSubCategoryId;
    private String color;
    private int fuelTypeId;
    private int locationId;
    private String vehicleImageUrl;
    private int availabilityStatus;
    private int pricePerDay;

    public VehicleDTO(int vehicleId,
                      String vehicleModel,
                      String vehicleNumber,
                      int vehicleSubCategoryId,
                      String color, int fuelTypeId,
                      int locationId,
                      String vehicleImageUrl,
                      int availabilityStatus,
                      int pricePerDay)
    {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSubCategoryId = vehicleSubCategoryId;
        this.color = color;
        this.fuelTypeId = fuelTypeId;
        this.locationId = locationId;
        this.vehicleImageUrl = vehicleImageUrl;
        this.availabilityStatus = availabilityStatus;
        this.pricePerDay = pricePerDay;
    }

    public VehicleDTO(){}

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleSubCategoryId() {
        return vehicleSubCategoryId;
    }

    public void setVehicleSubCategoryId(int vehicleSubCategoryId) {
        this.vehicleSubCategoryId = vehicleSubCategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleSubCategoryId=" + vehicleSubCategoryId +
                ", color='" + color + '\'' +
                ", fuelTypeId=" + fuelTypeId +
                ", locationId=" + locationId +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
