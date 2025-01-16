package com.example.trainservice.service;

import com.example.trainservice.dto.TrainRequest;
import com.example.trainservice.model.Train;
import com.example.trainservice.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    // Add a new train
    public Train addTrain(TrainRequest request) {
        Train train = new Train();
        train.setTrainNumber(request.getTrainNumber());
        train.setTrainName(request.getTrainName());
        train.setSource(request.getSource());
        train.setDestination(request.getDestination());
        train.setSchedule(request.getSchedule());
        train.setAvailableSeats(request.getAvailableSeats());
        return trainRepository.save(train);
    }

    // Retrieve all trains
    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    // Get train by number
    public Train getTrainByNumber(String trainNumber) {
        return trainRepository.findByTrainNumber(trainNumber)
                .orElseThrow(() -> new RuntimeException("Train not found"));
    }
}
