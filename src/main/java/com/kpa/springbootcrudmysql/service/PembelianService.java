package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.Pembelian;
import com.kpa.springbootcrudmysql.repository.PembelianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PembelianService {

	@Autowired
	private PembelianRepository pembelianRepository;


	public List<Pembelian> getLaporanPembelian(){
		return  pembelianRepository.findAll();
	}

	//Return list of contacts
	public List<Pembelian> getPembelian() {
		return pembelianRepository.findAll();
	}

	//SAve new contact
	public void save(Pembelian pembelian) {
		pembelianRepository.save(pembelian);
	}

	//get by id
	public Optional<Pembelian> findById(Integer id_pembelian) {
		return pembelianRepository.findById(id_pembelian);
	}

	public void delete(Integer id_pembelian) {
		pembelianRepository.deleteById(id_pembelian);
	}


}
