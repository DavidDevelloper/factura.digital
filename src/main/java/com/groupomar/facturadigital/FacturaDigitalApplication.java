package com.groupomar.facturadigital;

import com.groupomar.facturadigital.models.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturaDigitalApplication implements CommandLineRunner {
	@Autowired
	IUploadFileService uploadFileService;

	public static void main(String[] args) {
		SpringApplication.run(FacturaDigitalApplication.class, args);


	}
	public void run(String... args) throws Exception{
		//todo-auto-generated metho stub
		uploadFileService.deleteAll();
		uploadFileService.init();
	}

}
