package com.pm.patientservice.kafka;

import com.pm.patientservice.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {

    private final KafkaTemplate<String, byte[]> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sedEvent(Patient patient){
        
    }

}
