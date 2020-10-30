package com.kpa.springbootcrudmysql.service;


import com.kpa.springbootcrudmysql.model.Pemasok;
import com.kpa.springbootcrudmysql.repository.PemasokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PemasokService {

	@Autowired
	private PemasokRepository pemasokRepository;

	public List<Pemasok> getLaporanPemasok(){
		return  pemasokRepository.findAll();
	}

	//Return list of contacts
	public List<Pemasok> getPemasok() {
		return pemasokRepository.findAll();
	}

	//SAve new contact
	public void save(Pemasok pemasok) {
		pemasokRepository.save(pemasok);
	}

	//get by id
	public Optional<Pemasok> findById(Integer id_pemasok) {
		return pemasokRepository.findById(id_pemasok);
	}

	public void delete(Integer id_pemasok) {
		pemasokRepository.deleteById(id_pemasok);
	}


}
