package com.fabiankevin.springboot.mapstructdemo;

import com.fabiankevin.springboot.mapstructdemo.models.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class MapstructDemoApplication implements CommandLineRunner {

	private final StudentMapper studentMapper;
	public static void main(String[] args) {
		SpringApplication.run(MapstructDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s = Student.builder()
				.id(2l)
				.name("Kevin Fabian")
				.birthDate(new Date())
				.build();
		System.out.println(studentMapper.toResource(s));

	}
}
