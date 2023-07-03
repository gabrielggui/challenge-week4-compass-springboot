package uol.compass.pb.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uol.compass.pb.challenge.model.Motorcycle;

public interface MotorcycleRepository extends MongoRepository<Motorcycle, String> {

}
