package com.kpa.springbootcrudmysql.controller;


import com.kpa.springbootcrudmysql.model.Barang;
import com.kpa.springbootcrudmysql.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BarangController {
	
	@Autowired	private BarangService barangService;

	@GetMapping("/barang")
	public String getBarang(Model model) {
		model.addAttribute("barang", barangService.getBarang());
		return "barang";
	}

	@GetMapping("/laporanBarang")
	public String getLaporanPembelian(Model model) {
		model.addAttribute("barang", barangService.getBarang());
		return "laporanBarang";
	}

	@PostMapping("/barang/addNew")
	public String addNew(Barang barang) {
		barangService.save(barang);
		return "redirect:/barang";
	}
	
	@RequestMapping("/barang/findById")
	@ResponseBody
	public Optional<Barang> findById(Integer id_barang) {
	  return barangService.findById(id_barang);
	}	
	
	@RequestMapping(value="/barang/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Barang barang) {
		barangService.save(barang);
		return "redirect:/barang";
	}
	
	@RequestMapping(value="/barang/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id_barang) {
		barangService.delete(id_barang);
		return "redirect:/barang";
	}

}
