package com.example.solid;

import com.example.solid.O.After.OrderA;
import com.example.solid.O.After.OrderB;
import com.example.solid.O.After.SumOrders;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		System.out.println(
				"Result: " + new SumOrders().sum(List.of(new OrderA(10.0), new OrderB(20.0)))
		);
	}

}
