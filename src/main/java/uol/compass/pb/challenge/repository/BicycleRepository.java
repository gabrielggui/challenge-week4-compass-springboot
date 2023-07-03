package uol.compass.pb.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uol.compass.pb.challenge.model.Bicycle;

public interface BicycleRepository extends MongoRepository<Bicycle, String> {

}
