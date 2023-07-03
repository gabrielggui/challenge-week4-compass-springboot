package uol.compass.pb.challenge.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;

@Document(collection = "vehicle")
public class Truck extends Vehicle {

	@Min(0)
	private Integer numberOfAxles;

	public Truck() {

	}

	public Truck(String brand, String model, String modelYear, Boolean hasEngine, Boolean hasSteeringWheel,
			Integer passengerCount, Integer doorCount, Integer wheelCount, Boolean isCargoVehicle,
			Double cargoCapacity, List<Fuel> fuels, Integer numberOfAxles) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.numberOfAxles = numberOfAxles;
	}

	public Integer getNumberOfAxles() {
		return numberOfAxles;
	}

	public void setNumberOfAxles(Integer numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

}
