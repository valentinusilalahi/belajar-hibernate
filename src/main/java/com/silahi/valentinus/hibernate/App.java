package com.silahi.valentinus.hibernate;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.silahi.valentinus.hibernate.Entity.Berita;
import com.silahi.valentinus.hibernate.Entity.Komentar;
import com.silahi.valentinus.hibernate.dao.BeritaDao;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);

		Berita berita = new Berita();
		berita.setJudulBerita("Contoh Berita");
		berita.setIsiBerita("Berita menambah wawasan dan menambah nilai sosial");
		berita.setWaktuPublikasiBerita(new Date());

		Komentar komentar = new Komentar();
		komentar.setEmail("valentinus.silalahi@gmail.com");
		komentar.setNama("Valentinus Silalahi");
		komentar.setIsiKomentar("Namun, Berita juga bisa membawa kita ke arah yang tidak benar");
		komentar.setWaktuPublikasiKomentar(new Date());
		komentar.setBerita(berita);

		berita.getDaftarKomentar().add(komentar);

		BeritaDao bDao = ctx.getBean(BeritaDao.class);
		bDao.save(berita);
	}
}
