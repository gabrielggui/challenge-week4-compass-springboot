package uol.compass.pb.challenge.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import uol.compass.pb.challenge.model.Bicycle;
import uol.compass.pb.challenge.model.Car;
import uol.compass.pb.challenge.model.Charrete;
import uol.compass.pb.challenge.model.Fuel;
import uol.compass.pb.challenge.model.Motorcycle;
import uol.compass.pb.challenge.model.Truck;
import uol.compass.pb.challenge.model.Vehicle;
import uol.compass.pb.challenge.service.VehicleService;

@Controller
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping("/list")
    public ModelAndView showList() {
        return new ModelAndView("vehiclelisting")
                .addObject("vehicles", vehicleService.getAllVehicles());
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditVehicle(@PathVariable("id") String id) {
        ModelAndView modelAndView = new ModelAndView("editvehicle");
        modelAndView.addObject("allFuels", Fuel.values());

        Vehicle vehicle = vehicleService.getVehicleById(id);

        if (vehicle instanceof Car){
            modelAndView.addObject("vehicle", (Car) vehicle);
        }
        else if (vehicle instanceof Motorcycle){
            modelAndView.addObject("vehicle", (Motorcycle) vehicle);
        }
        else if (vehicle instanceof Bicycle){
            modelAndView.addObject("vehicle", (Bicycle) vehicle);
        }
        else if (vehicle instanceof Truck){
            modelAndView.addObject("vehicle", (Truck) vehicle);
        }
        else if (vehicle instanceof Charrete){
            modelAndView.addObject("vehicle", (Charrete) vehicle);
        }

        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public RedirectView deleteVehicle(@PathVariable("id") String id) {
        vehicleService.deleteVehicleById(id);
        
        return new RedirectView("/list?sucess");
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "vehicleregistration";
    }

    @PostMapping("/register/save")
    public RedirectView submitRegistrationForm(@RequestParam Map<String, Object> requestMap,
            @RequestParam("fuels") List<String> selectedFuels) {
        vehicleService.saveVehicle(requestMap, selectedFuels);
        return new RedirectView("/list?sucess");
    }

}
