package uol.compass.pb.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uol.compass.pb.challenge.model.Truck;

public interface TruckRepository extends MongoRepository<Truck, String> {

}
