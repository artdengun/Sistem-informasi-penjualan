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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_pembelian")
public class Pembelian {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pembelian;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date tanggal_pembelian;
	private String nama_barang_pembelian;
	private Integer harga_satuan_pembelian;
	private Integer banyak_pembelian;
	private Integer total_harga_pembelian;
	private String remarks;

	@ManyToOne
	@JoinColumn(name = "pemasokid", insertable = false, updatable = false)
	private Pemasok pemasok;
	private Integer pemasokid;
	private String alamat_pemasok;
}
