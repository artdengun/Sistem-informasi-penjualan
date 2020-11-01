package com.kpa.springbootcrudmysql.repository;

import com.kpa.springbootcrudmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //  1. kita get buat get username
    User findByUsername(String username);

}
