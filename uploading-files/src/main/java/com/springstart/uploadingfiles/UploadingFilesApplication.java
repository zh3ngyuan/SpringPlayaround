package com.springstart.uploadingfiles;

import com.springstart.uploadingfiles.storage.StorageProperties;
import com.springstart.uploadingfiles.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadingFilesApplication.class, args);
	}

	@Bean
	CommandLineRunner onInit(StorageService storageService) {
		return args -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
