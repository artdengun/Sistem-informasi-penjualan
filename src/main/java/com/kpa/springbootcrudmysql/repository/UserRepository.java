package com.kpa.springbootcrudmysql.repository;

import com.kpa.springbootcrudmysql.model.Penjualan;
import com.kpa.springbootcrudmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
