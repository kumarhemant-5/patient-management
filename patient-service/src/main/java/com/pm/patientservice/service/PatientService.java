package com.pm.patientservice.service;

import com.pm.patientservice.dao.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public void getPatientById(UUID id){
        if(patientRepository.findById(id).isEmpty()){
            System.out.println("Patient with this id is not present");
        }else{
            System.out.println("Patient is present");
        }
    }
}
