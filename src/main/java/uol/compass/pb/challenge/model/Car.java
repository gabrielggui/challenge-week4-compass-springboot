package uol.compass.pb.challenge.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

@Document(collection = "vehicle")
public class Car extends Vehicle {

	@NotNull
	private Boolean airConditioning;
	@NotNull
	private Boolean radio;

	public Car() {

	}

	public Car(String brand, String model, String modelYear, Boolean hasEngine, Boolean hasSteeringWheel,
			Integer passengerCount, Integer doorCount, Integer wheelCount, Boolean isCargoVehicle,
			Double cargoCapacity, List<Fuel> fuels, Boolean airConditioning, Boolean radio) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.airConditioning = airConditioning;
		this.radio = radio;
	}

	public Boolean getHasAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(Boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	public Boolean getHasRadio() {
		return radio;
	}

	public void setRadio(Boolean radio) {
		this.radio = radio;
	}

}
