package com.kpa.springbootcrudmysql.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_penjualan")
public class Penjualan {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_penjualan;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date tanggal_penjualan;
	private Integer harga_satuan;
	private Integer total_harga;
	private Integer banyak;

	@ManyToOne
	@JoinColumn(name = "barangid", insertable = false, updatable = false)
	private  Barang barang;
	private Integer barangid;
	private Integer id_barang;

	@ManyToOne
	@JoinColumn(name = "pelangganid", insertable = false, updatable = false)
	private Pelanggan pelanggan;
	private Integer pelangganid;
	private Integer id_pelanggan;
}
