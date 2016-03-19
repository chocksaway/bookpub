package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.bookpub.repository.BookRepository;

public class StartupRunner implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private DataSource ds;
    @Override
    public void run(String... args) throws Exception {
        logger.info("DataSource: "+ds.toString());
    }

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
        logger.info("Number of books: " + bookRepository.count());
    }
}
