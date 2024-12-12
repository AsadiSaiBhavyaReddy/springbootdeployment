package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Farmer;

public interface AdminService 
{
   public List<Farmer> viewalfarmers();
   public Admin checkAdminLogin(String uname,String pwd);
}
