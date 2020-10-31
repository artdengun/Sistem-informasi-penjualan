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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_pelanggan")
public class Pelanggan {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_pelanggan;
	private String nama_pelanggan;
	private String alamat_pelanggan;
	private String tlp_pelanggan;
	private String email_pelanggan;


	@OneToMany(mappedBy = "pelanggan")
	List<Penjualan> penjualans;

	@ManyToOne
	@JoinColumn(name = "userid", insertable = false, updatable = false)
	private User user;
	private Integer userid;
	private Integer id_user;
}
