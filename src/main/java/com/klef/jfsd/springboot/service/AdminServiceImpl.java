package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Farmer;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.FarmerRepository;

@Service
public class AdminServiceImpl implements AdminService{
   @Autowired
	private FarmerRepository farmerRepository;
   @Autowired
   private AdminRepository adminRepository;
	@Override
	public List<Farmer> viewalfarmers() {
		return farmerRepository.findAll();
	}
	@Override
	public Admin checkAdminLogin(String uname, String pwd) {
		return adminRepository.checkAdminLogin(uname, pwd);
	}

}
