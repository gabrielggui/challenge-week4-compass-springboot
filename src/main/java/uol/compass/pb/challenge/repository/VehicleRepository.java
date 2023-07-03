package uol.compass.pb.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uol.compass.pb.challenge.model.Vehicle;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    
}
