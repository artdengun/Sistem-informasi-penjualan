package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.Pelanggan;
import com.kpa.springbootcrudmysql.model.Pembelian;
import com.kpa.springbootcrudmysql.repository.PelangganRepository;
import com.kpa.springbootcrudmysql.repository.PembelianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PelangganService {

	@Autowired
	private PelangganRepository pelangganRepository;


	public List<Pelanggan> getLaporanPelanggan(){
		return  pelangganRepository.findAll();
	}

	//Return list of contacts
	public List<Pelanggan> getPelanggan() {
		return pelangganRepository.findAll();
	}

	//SAve new contact
	public void save(Pelanggan pelanggan) {
		pelangganRepository.save(pelanggan);
	}

	//get by id
	public Optional<Pelanggan> findById(Integer id_pelanggan) {
		return pelangganRepository.findById(id_pelanggan);
	}

	public void delete(Integer id_pelanggan) {
		pelangganRepository.deleteById(id_pelanggan);
	}


}
