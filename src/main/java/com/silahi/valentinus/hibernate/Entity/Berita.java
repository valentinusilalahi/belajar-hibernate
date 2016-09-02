package com.silahi.valentinus.hibernate.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "berita")
public class Berita {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "waktu_publikasi_berita", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date waktuPublikasiBerita;

	@Column(name = "judul_berita", nullable = false)
	private String judulBerita;

	@Column(name = "isi_berita", nullable = false)
	private String isiBerita;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id_berita")
	private List<Komentar> daftarKomentar = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJudulBerita() {
		return judulBerita;
	}

	public Date getWaktuPublikasiBerita() {
		return waktuPublikasiBerita;
	}

	public void setWaktuPublikasiBerita(Date waktuPublikasiBerita) {
		this.waktuPublikasiBerita = waktuPublikasiBerita;
	}

	public void setJudulBerita(String judulBerita) {
		this.judulBerita = judulBerita;
	}

	public String getIsiBerita() {
		return isiBerita;
	}

	public void setIsiBerita(String isiBerita) {
		this.isiBerita = isiBerita;
	}

	public List<Komentar> getDaftarKomentar() {
		return daftarKomentar;
	}

	public void setDaftarKomentar(List<Komentar> daftarKomentar) {
		this.daftarKomentar = daftarKomentar;
	}

}
