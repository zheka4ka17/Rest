package com.example.Rest.services;

import com.example.Rest.models.Sensor;
import com.example.Rest.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;
@Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }
@Transactional
    public void createSensor(Sensor sensor){
    sensorRepository.save(sensor);
    }
}
