package uol.compass.pb.challenge.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

@Document(collection = "vehicle")
public class Bicycle extends Vehicle {

	@NotNull
	private Boolean hasLuggageCarrier;

	public Bicycle() {

	}

	public Bicycle(String brand, String model, String modelYear, Boolean hasEngine, Boolean hasSteeringWheel,
			Integer passengerCount, Integer doorCount, Integer wheelCount, Boolean isCargoVehicle,
			Double cargoCapacity, List<Fuel> fuels, Boolean hasLuggageCarrier) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
		this.hasLuggageCarrier = hasLuggageCarrier;
	}

	public Boolean getHasLuggageCarrier() {
		return hasLuggageCarrier;
	}

	public void setHasLuggageCarrier(Boolean hasLuggageCarrier) {
		this.hasLuggageCarrier = hasLuggageCarrier;
	}

}
