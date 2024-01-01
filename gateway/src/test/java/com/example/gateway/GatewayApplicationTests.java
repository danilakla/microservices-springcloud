package com.example.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class GatewayApplicationTests {

	@Test
	void contextLoads() {
		List<Integer> list = new ArrayList<>() {{

			add(1); add(2); add(2); add(5);

		}};
		System.out.println(Map.of(1, "one", 2, "two", 3, "three").entrySet().stream()

				.filter(entry -> entry.getValue().length() > 3)

				.map(Map.Entry::getKey)

				.findFirst() .map(x -> "result = " + x)

				.orElse("result = null"));


		list.remove(2);
		list.removeIf(x -> x == 2);
		list.retainAll(List.of(1, 5));
		list.set(2, 2);
	}

}
