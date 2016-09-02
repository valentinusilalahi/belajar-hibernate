package com.silahi.valentinus.hibernate.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "komentar")
public class Komentar {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "waktu_publikasi_komentar", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date waktuPublikasiKomentar;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String nama;

	@Column(name = "isi_komentar", nullable = false)
	private String isiKomentar;

	@ManyToOne
	@JoinColumn(name = "id_berita", insertable = false, updatable = false)
	private Berita berita;

	public Berita getBerita() {
		return berita;
	}

	public void setBerita(Berita berita) {
		this.berita = berita;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getWaktuPublikasiKomentar() {
		return waktuPublikasiKomentar;
	}

	public void setWaktuPublikasiKomentar(Date waktuPublikasiKomentar) {
		this.waktuPublikasiKomentar = waktuPublikasiKomentar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getIsiKomentar() {
		return isiKomentar;
	}

	public void setIsiKomentar(String isiKomentar) {
		this.isiKomentar = isiKomentar;
	}

}
