package com.kpa.springbootcrudmysql.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_user")
public class User {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_user;
	private String username;
	private String password;
	private String level;

	@OneToMany(mappedBy = "user")
	private List<Pemasok> pemasoks;

	@OneToMany(mappedBy = "user")
	private List<Pelanggan> pelanggans;
}