package com.kpa.springbootcrudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pemasok {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pemasok;
	private String nama_pemasok;
	private String alamat_pemasok;
	private String telephone_pemasok;
	private String email_pemasok;
}
