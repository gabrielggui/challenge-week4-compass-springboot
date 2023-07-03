package uol.compass.pb.challenge.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

@Document(collection = "vehicle")
public class Motorcycle extends Vehicle {

	@NotNull
	private Boolean hasElectricStart;

	public Motorcycle() {

	}

	public Motorcycle(String brand, String model, String modelYear, Boolean hasEngine, Boolean hasSteeringWheel,
			Integer passengerCount, Integer doorCount, Integer wheelCount, Boolean isCargoVehicle,
			Double cargoCapacity, List<Fuel> fuels, Boolean hasElectricStart) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.hasElectricStart = hasElectricStart;
	}

	public Boolean getHasElectricStart() {
		return hasElectricStart;
	}

	public void setElectricStart(Boolean electricStart) {
		this.hasElectricStart = electricStart;
	}

}
