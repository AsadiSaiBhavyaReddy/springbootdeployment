package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.klef.jfsd.springboot.model.Farmer;
import com.klef.jfsd.springboot.service.FarmerService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @GetMapping("/farmerreg")
    public ModelAndView farmerReg() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("farmerreg");
        return mv;
    }

    @PostMapping("/insertfarmer")
    public ModelAndView insertFarmer(HttpServletRequest request) {
        Farmer farmer = new Farmer();
        farmer.setFarmername(request.getParameter("farmername"));
        farmer.setGender(request.getParameter("gender"));
        farmer.setDateofbirth(request.getParameter("dateofbirth"));
        farmer.setContactno(request.getParameter("contactno"));
        farmer.setEmail(request.getParameter("email"));
        farmer.setPassword(request.getParameter("password"));
        farmer.setPrice(request.getParameter("price"));
        farmer.setProduct(request.getParameter("product"));
        farmer.setExpertname(request.getParameter("expertname"));

        String message = farmerService.farmerRegistration(farmer);
        ModelAndView mv = new ModelAndView("regsuccess");
        mv.addObject("message", message);
        return mv;
    }

    @GetMapping("/viewfarmers")
    public ModelAndView viewFarmers() {
        List<Farmer> farmers = farmerService.getAllFarmers();
        ModelAndView mv = new ModelAndView("viewfarmers");
        mv.addObject("farmers", farmers);
        return mv;
    }

    @GetMapping("/updatefarmer/{id}")
    public ModelAndView updateFarmerForm(@PathVariable("id") int id) {
        Farmer farmer = farmerService.getFarmerById(id);
        ModelAndView mv = new ModelAndView("updatefarmer");
        mv.addObject("farmer", farmer);
        return mv;
    }

    @PostMapping("/updatefarmer")
    public ModelAndView updateFarmer(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Farmer farmer = farmerService.getFarmerById(id);
        farmer.setFarmername(request.getParameter("farmername"));
        farmer.setGender(request.getParameter("gender"));
        farmer.setDateofbirth(request.getParameter("dateofbirth"));
        farmer.setContactno(request.getParameter("contactno"));
        farmer.setEmail(request.getParameter("email"));
        farmer.setPassword(request.getParameter("password"));
        farmer.setPrice(request.getParameter("price"));
        farmer.setProduct(request.getParameter("product"));
        farmer.setExpertname(request.getParameter("expertname"));

        String message = farmerService.updateFarmer(farmer);
        ModelAndView mv = new ModelAndView("updatesuccess");
        mv.addObject("message", message);
        return mv;
    }

    @GetMapping("/deletefarmer/{id}")
    public ModelAndView deleteFarmer(@PathVariable("id") int id) {
        String message = farmerService.deleteFarmerById(id);
        ModelAndView mv = new ModelAndView("deletesuccess");
        mv.addObject("message", message);
        return mv;
    }
}
