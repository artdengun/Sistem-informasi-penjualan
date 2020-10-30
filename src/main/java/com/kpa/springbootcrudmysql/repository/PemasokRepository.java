package com.kpa.springbootcrudmysql.repository;

import com.kpa.springbootcrudmysql.model.Pemasok;
import com.kpa.springbootcrudmysql.model.Pembelian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PemasokRepository extends JpaRepository<Pemasok, Integer>{

}
