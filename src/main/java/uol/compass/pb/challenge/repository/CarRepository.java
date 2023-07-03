package uol.compass.pb.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uol.compass.pb.challenge.model.Car;

public interface CarRepository extends MongoRepository<Car, String> {

}
