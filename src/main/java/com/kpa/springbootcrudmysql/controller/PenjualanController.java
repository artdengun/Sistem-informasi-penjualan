package com.kpa.springbootcrudmysql.controller;


import com.kpa.springbootcrudmysql.model.Pelanggan;
import com.kpa.springbootcrudmysql.model.Penjualan;
import com.kpa.springbootcrudmysql.service.PelangganService;
import com.kpa.springbootcrudmysql.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PenjualanController {
	
	@Autowired	private PenjualanService penjualanService;

	@GetMapping("/penjualan")
	public String getPenjualan(Model model) {
		model.addAttribute("penjualan", penjualanService.getPenjualan());
		return "penjualan";
	}

	@GetMapping("/laporanPenjualan")
	public String getLaporanPenjualan(Model model) {
		model.addAttribute("penjualan", penjualanService.getLaporanPenjualan());
		return "laporanPenjualan";
	}

	@PostMapping("/penjualan/addNew")
	public String addNew(Penjualan penjualan) {
		penjualanService.save(penjualan);
		return "redirect:/penjualan";
	}
	
	@RequestMapping("penjualan/findById")
	@ResponseBody
	public Optional<Penjualan> findById(Integer id_penjualan) {
	  return penjualanService.findById(id_penjualan);
	}	
	
	@RequestMapping(value="/penjualan/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Penjualan penjualan) {
		penjualanService.save(penjualan);
		return "redirect:/penjualan";
	}
	
	@RequestMapping(value="/penjualan/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id_penjualan) {
		penjualanService.delete(id_penjualan);
		return "redirect:/penjualan";
	}

}
