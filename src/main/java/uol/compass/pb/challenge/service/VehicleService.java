package uol.compass.pb.challenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import uol.compass.pb.challenge.model.Bicycle;
import uol.compass.pb.challenge.model.Car;
import uol.compass.pb.challenge.model.Charrete;
import uol.compass.pb.challenge.model.Fuel;
import uol.compass.pb.challenge.model.Motorcycle;
import uol.compass.pb.challenge.model.Truck;
import uol.compass.pb.challenge.model.Vehicle;
import uol.compass.pb.challenge.repository.BicycleRepository;
import uol.compass.pb.challenge.repository.CarRepository;
import uol.compass.pb.challenge.repository.CharreteRepository;
import uol.compass.pb.challenge.repository.MotorcycleRepository;
import uol.compass.pb.challenge.repository.TruckRepository;
import uol.compass.pb.challenge.repository.VehicleRepository;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    CarRepository carRepository;
    @Autowired
    MotorcycleRepository motorcycleRepository;
    @Autowired
    BicycleRepository bicycleRepository;
    @Autowired
    TruckRepository truckRepository;
    @Autowired
    CharreteRepository charreteRepository;
    @Autowired
    private Validator validator;

    public void saveVehicle(Map<String, Object> requestMap, List<String> selectedFuels) {
        ModelMapper modelMapper = new ModelMapper();

        List<Fuel> fuels = new ArrayList<>();

        for (Fuel fuel : Fuel.values()) {
            if (selectedFuels.contains(fuel.name()))
                fuels.add(fuel);
        }

        switch (requestMap.get("categories").toString()) {
            case "car":
                Car car = modelMapper.map(requestMap, Car.class);
                car.setFuels(fuels);
                vehicleValidation(car);
                carRepository.save(car);
                break;
            case "motorcycle":
                Motorcycle motorcycle = modelMapper.map(requestMap, Motorcycle.class);
                motorcycle.setFuels(fuels);
                vehicleValidation(motorcycle);
                motorcycleRepository.save(motorcycle);
                break;
            case "bicycle":
                Bicycle bicycle = modelMapper.map(requestMap, Bicycle.class);
                bicycle.setFuels(fuels);
                vehicleValidation(bicycle);
                bicycleRepository.save(bicycle);
                break;
            case "truck":
                Truck truck = modelMapper.map(requestMap, Truck.class);
                truck.setFuels(fuels);
                vehicleValidation(truck);
                truckRepository.save(truck);
                break;
            case "charrete":
                Charrete charrete = modelMapper.map(requestMap, Charrete.class);
                charrete.setFuels(fuels);
                vehicleValidation(charrete);
                charreteRepository.save(charrete);
                break;
        }

    }

    private void vehicleValidation(Vehicle vehicle) {
        Set<ConstraintViolation<Object>> violations = validator.validate(vehicle);
        if (!violations.isEmpty()) {
            throw new ValidationException("Erro de validação do veículo:" + violations.toString());
        }
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(String id) {
        return vehicleRepository.findById(id).get();
    }

    public void deleteVehicleById(String id) {
        vehicleRepository.deleteById(id);
    }

}
