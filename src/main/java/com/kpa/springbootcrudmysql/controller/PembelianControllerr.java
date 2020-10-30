package com.kpa.springbootcrudmysql.controller;


import com.kpa.springbootcrudmysql.model.Pemasok;
import com.kpa.springbootcrudmysql.model.Pembelian;
import com.kpa.springbootcrudmysql.service.PemasokService;
import com.kpa.springbootcrudmysql.service.PembelianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PembelianControllerr {
	
	@Autowired	private PembelianService pembelianService;
	@Autowired private PemasokService pemasokService;


	@GetMapping("/pembelians")
	public String getPembelians(Model model) {
		List<Pembelian> pembelianList = pembelianService.getPembelian();
		model.addAttribute("pembelians", pembelianList);

		List<Pemasok> pemasokList = pemasokService.getPemasok();
		model.addAttribute("pemasok", pemasokList);

		return "pembelian";
	}

	@GetMapping("/laporanPembelian")
	public String getLaporanPembelian(Model model) {
		model.addAttribute("pembelian", pembelianService.getPembelian());
		return "laporanPembelian";
	}

	@PostMapping("/pembelian/addNew")
	public String addNew(Pembelian pembelian) {
		pembelianService.save(pembelian);
		return "redirect:/pembelians";
	}
	
	@RequestMapping("pembelian/findById")
	@ResponseBody
	public Optional<Pembelian> findById(Integer id_pembelian) {
	  return pembelianService.findById(id_pembelian);
	}	
	
	@RequestMapping(value="/pembelian/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Pembelian pembelian) {
		pembelianService.save(pembelian);
		return "redirect:/pembelians";
	}
	
	@RequestMapping(value="/pembelian/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id_pembelian) {
		pembelianService.delete(id_pembelian);
		return "redirect:/pembelians";
	}

}
