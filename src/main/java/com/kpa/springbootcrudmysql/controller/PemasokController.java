package com.kpa.springbootcrudmysql.controller;


import com.kpa.springbootcrudmysql.model.Pemasok;
import com.kpa.springbootcrudmysql.service.PemasokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PemasokController {
	
	@Autowired	private PemasokService pemasokService;

	@GetMapping("/pemasok")
	public String getPemasok(Model model) {
		List<Pemasok> pemasokList = pemasokService.getPemasok();
		model.addAttribute("pemasok", pemasokList);
		return "pemasok";
	}

	@GetMapping("/laporanPemasok")
	public String getLaporanPemasok(Model model) {
		model.addAttribute("pemasok", pemasokService.getPemasok());
		return "laporanPemasok";
	}

	@PostMapping("/pemasok/addNew")
	public String addNew(Pemasok pemasok) {
		pemasokService.save(pemasok);
		return "redirect:/pemasok";
	}
	
	@RequestMapping("pemasok/findById")
	@ResponseBody
	public Optional<Pemasok> findById(Integer id_pemasok) {
	  return pemasokService.findById(id_pemasok);
	}	
	
	@RequestMapping(value="/pemasok/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Pemasok pemasok) {
		pemasokService.save(pemasok);
		return "redirect:/pemasok";
	}
	
	@RequestMapping(value="/pemasok/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id_pemasok) {
		pemasokService.delete(id_pemasok);
		return "redirect:/pemasok";
	}

}
