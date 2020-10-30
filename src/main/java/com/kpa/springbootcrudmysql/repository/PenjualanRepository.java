package com.kpa.springbootcrudmysql.repository;

import com.kpa.springbootcrudmysql.model.Pelanggan;
import com.kpa.springbootcrudmysql.model.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenjualanRepository extends JpaRepository<Penjualan, Integer>{

}
