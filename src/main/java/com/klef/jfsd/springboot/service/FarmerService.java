package com.klef.jfsd.springboot.service;



import java.util.List;

import com.klef.jfsd.springboot.model.Farmer;
public interface FarmerService {
    String farmerRegistration(Farmer farmer);
    Farmer checkFarmerLogin(String email, String password);
    List<Farmer> getAllFarmers();
    Farmer getFarmerById(int id);
    String updateFarmer(Farmer farmer);
    String deleteFarmerById(int id);
}

