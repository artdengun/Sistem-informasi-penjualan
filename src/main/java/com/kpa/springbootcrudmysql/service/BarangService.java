package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.Barang;
import com.kpa.springbootcrudmysql.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarangService {

	@Autowired
	private BarangRepository barangRepository;

	//Return nilai Barang
	public List<Barang> getBarang(){
		return barangRepository.findAll();
	}

	//SAve new contact
	public void save(Barang barang) {
		barangRepository.save(barang);
	}

	//get by id
	public Optional<Barang> findById(Integer id_barang) {
		return barangRepository.findById(id_barang);
	}
	// return delete
	public void delete(Integer id_barang) {
		barangRepository.deleteById(id_barang);
	}


}
