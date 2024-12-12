package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Farmer;
import com.klef.jfsd.springboot.repository.FarmerRepository;
@Service
public class FarmerServiceImpl implements FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;

    @Override
    public String farmerRegistration(Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer Registered Successfully";
    }

    @Override
    public Farmer checkFarmerLogin(String email, String password) {
        return farmerRepository.checkfarmerLogin(email, password);
    }

    @Override
    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    @Override
    public Farmer getFarmerById(int id) {
        return farmerRepository.findById(id).orElse(null);
    }

    @Override
    public String updateFarmer(Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer Updated Successfully";
    }

    @Override
    public String deleteFarmerById(int id) {
        farmerRepository.deleteById(id);
        return "Farmer Deleted Successfully";
    }
}
