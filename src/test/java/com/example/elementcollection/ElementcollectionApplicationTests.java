package com.example.elementcollection;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.elementcollection.model.Car;
import com.example.elementcollection.model.Type;
import com.example.elementcollection.repository.CarRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElementcollectionApplicationTests {

	/*
	 * @Test public void contextLoads() { }
	 */
	
	
	@Autowired
	private CarRepository carRepository;
	
	@Test
	public void createCar()
	{
		String name = "Swift";
		Car car = new Car();
		car.setName(name);
		car.setId(1l);
		car.setTypes(new HashSet<>(Arrays.asList(Type.HATCHBACK, Type.SEDAN)));
		carRepository.save(car);
		
		
		Car car2 = carRepository.findByName("Swift");
		
		
		System.out.println(car2);
		
		assertThat(car2.equals(car));
	}
	
	

}
