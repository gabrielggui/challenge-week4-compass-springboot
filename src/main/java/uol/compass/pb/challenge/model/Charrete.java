package uol.compass.pb.challenge.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicle")
public class Charrete extends Vehicle {

	public Charrete(String brand, String model, String modelYear, Boolean hasEngine, Boolean hasSteeringWheel,
			Integer passengerCount, Integer doorCount, Integer wheelCount, Boolean isCargoVehicle,
			Double cargoCapacity, List<Fuel> fuels) {
		super(brand, model, modelYear, hasEngine, hasSteeringWheel, passengerCount, doorCount, wheelCount,
				isCargoVehicle, cargoCapacity, fuels);
	}

	public Charrete() {

	}

}
