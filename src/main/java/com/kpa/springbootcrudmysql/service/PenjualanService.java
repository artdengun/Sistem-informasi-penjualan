package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.Penjualan;
import com.kpa.springbootcrudmysql.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PenjualanService {

	@Autowired
	private PenjualanRepository penjualanRepository;


	public List<Penjualan> getLaporanPenjualan(){
		return  penjualanRepository.findAll();
	}

	//Return list of contacts
	public List<Penjualan> getPenjualan() {
		return penjualanRepository.findAll();
	}

	//SAve new contact
	public void save(Penjualan penjualan) {
		penjualanRepository.save(penjualan);
	}

	//get by id
	public Optional<Penjualan> findById(Integer id_penjualan) {
		return penjualanRepository.findById(id_penjualan);
	}

	public void delete(Integer id_penjualan) {
		penjualanRepository.deleteById(id_penjualan);
	}


}
