package com.kpa.springbootcrudmysql.repository;

import com.kpa.springbootcrudmysql.model.Pelanggan;
import com.kpa.springbootcrudmysql.model.Pembelian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelangganRepository extends JpaRepository<Pelanggan, Integer>{

}
