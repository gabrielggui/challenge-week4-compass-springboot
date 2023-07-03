package uol.compass.pb.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uol.compass.pb.challenge.model.Charrete;

public interface CharreteRepository extends MongoRepository<Charrete, String> {

}
