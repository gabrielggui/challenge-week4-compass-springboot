package uol.compass.pb.challenge.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Document(collection = "vehicle")
public class Vehicle {

	@Id
	private String id;
	@NotBlank
	private String brand;
	@NotBlank
	private String model;
	@NotBlank
	private String modelYear;
	@NotNull
	private Boolean hasEngine;
	@NotNull
	private Boolean hasSteeringWheel;
	@Min(0)
	private Integer passengerCount;
	@Min(0)
	private Integer doorCount;
	@Min(0)
	private Integer wheelCount;
	@NotNull
	private Boolean isCargoVehicle;
	@Min(0)
	private Double cargoCapacity;
	@NotNull
	private List<Fuel> fuels;

	public Vehicle() {

	}

	public Vehicle(String brand, String model, String modelYear, Boolean hasEngine, Boolean hasSteeringWheel,
			Integer passengerCount, Integer doorCount, Integer wheelCount, Boolean isCargoVehicle,
			Double cargoCapacity, List<Fuel> fuels) {
		this.brand = brand;
		this.model = model;
		this.modelYear = modelYear;
		this.hasEngine = hasEngine;
		this.hasSteeringWheel = hasSteeringWheel;
		this.passengerCount = passengerCount;
		this.doorCount = doorCount;
		this.wheelCount = wheelCount;
		this.isCargoVehicle = isCargoVehicle;
		this.cargoCapacity = cargoCapacity;
		this.fuels = fuels;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public Boolean getHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(Boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public Boolean getHasSteeringWheel() {
		return hasSteeringWheel;
	}

	public void setHasSteeringWheel(Boolean hasSteeringWheel) {
		this.hasSteeringWheel = hasSteeringWheel;
	}

	public Integer getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public Integer getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(Integer doorCount) {
		this.doorCount = doorCount;
	}

	public Integer getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(Integer wheelCount) {
		this.wheelCount = wheelCount;
	}

	public Boolean getIsCargoVehicle() {
		return isCargoVehicle;
	}

	public void setIsCargoVehicle(Boolean isCargoVehicle) {
		this.isCargoVehicle = isCargoVehicle;
	}

	public Double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(Double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public List<Fuel> getFuels() {
		return fuels;
	}

	public void setFuels(List<Fuel> fuels) {
		this.fuels = fuels;
	}

}
