package com.example.trainservice.controller;

import com.example.trainservice.dto.TrainRequest;
import com.example.trainservice.model.Train;
import com.example.trainservice.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainService trainService;

    // Add a new train
    @PostMapping
    public Train addTrain(@RequestBody TrainRequest trainRequest) {
        return trainService.addTrain(trainRequest);
    }

    // Get all trains
    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    // Get train by number
    @GetMapping("/{trainNumber}")
    public Train getTrainByNumber(@PathVariable String trainNumber) {
        return trainService.getTrainByNumber(trainNumber);
    }
}
