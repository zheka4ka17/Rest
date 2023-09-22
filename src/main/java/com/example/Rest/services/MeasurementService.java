package com.example.Rest.services;

import com.example.Rest.models.Measurement;
import com.example.Rest.repositories.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MeasurementService {
    private final MeasurementRepository measurementRepository;
@Autowired
    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    public List<Measurement> findAll(){
    return measurementRepository.findAll();
    }
    @Transactional
    public void addMeasurement(Measurement measurement){
    measurementRepository.save(measurement);
    }

}
