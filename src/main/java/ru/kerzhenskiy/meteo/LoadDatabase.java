package ru.kerzhenskiy.meteo;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DavisRepository repository) {

      return args -> {

        try {
            Path path = Paths.get(getClass().getClassLoader().getResource("/home/ilya/src_meteo/src/main/resources/static/test.data").toURI());
            try (Stream<String> lines = Files.lines(path)){
                lines.forEach(r->log.info("Preloading " + repository.save(new Davis(r))));
            }
        } catch (Exception e){
            log.info(e.getMessage());
        }
      };
    }
}
