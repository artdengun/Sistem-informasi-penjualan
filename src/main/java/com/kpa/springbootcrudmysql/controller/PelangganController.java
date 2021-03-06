package com.kpa.springbootcrudmysql.controller;


import com.kpa.springbootcrudmysql.model.Pelanggan;
import com.kpa.springbootcrudmysql.model.Pembelian;
import com.kpa.springbootcrudmysql.model.User;
import com.kpa.springbootcrudmysql.service.PelangganService;
import com.kpa.springbootcrudmysql.service.PembelianService;
import com.kpa.springbootcrudmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PelangganController {
	
	@Autowired	private PelangganService pelangganService;
	@Autowired private UserService userService;

	@GetMapping("/pelanggans")
	public String getPelanggan(Model model) {
		List<Pelanggan> pelangganList = pelangganService.getPelanggan();
		model.addAttribute("pelanggan", pelangganList);

		List<User> userList = userService.getUser();
		model.addAttribute("user", userList);
		return "pelanggan";
	}

	@GetMapping("/laporanPelanggan")
	public String getLaporanPelanggan(Model model) {
		model.addAttribute("pelanggan", pelangganService.getLaporanPelanggan());
		return "laporanPelanggan";
	}

	@PostMapping("/pelanggan/addNew")
	public String addNew(Pelanggan pelanggan) {
		pelangganService.save(pelanggan);
		return "redirect:/pelanggans";
	}
	
	@RequestMapping("pelanggan/findById")
	@ResponseBody
	public Optional<Pelanggan> findById(Integer id_pelanggan) {
	  return pelangganService.findById(id_pelanggan);
	}	
	
	@RequestMapping(value="/pelanggan/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Pelanggan pelanggan) {
		pelangganService.save(pelanggan);
		return "redirect:/pelanggans";
	}
	
	@RequestMapping(value="/pelanggan/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id_pelanggan) {
		pelangganService.delete(id_pelanggan);
		return "redirect:/pelanggans";
	}

}
