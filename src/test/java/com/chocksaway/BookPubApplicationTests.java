package com.chocksaway;

import com.chocksaway.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BookPubApplication.class)
public class BookPubApplicationTests {
	@Autowired
	private BookRepository bookRepository;

	@Test
	public void contextLoads() {
	}

}
