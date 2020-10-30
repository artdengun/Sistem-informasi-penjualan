package com.kpa.springbootcrudmysql.repository;

import com.kpa.springbootcrudmysql.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Integer>{

}
