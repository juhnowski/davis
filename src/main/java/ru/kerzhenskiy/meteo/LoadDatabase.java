package ru.kerzhenskiy.meteo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    // @Bean
    // CommandLineRunner initDatabase(DavisRepository repository) {

    //   return args -> {

    //     try {
    //         Path path = Paths.get(getClass().getClassLoader().getResource("/home/ilya/src_meteo/src/main/resources/static/test.data").toURI());
    //         try (Stream<String> lines = Files.lines(path)){
    //             lines.forEach(r->log.info("Preloading " + repository.save(new Davis(r))));
    //         }
    //     } catch (Exception e){
    //         log.info(e.getMessage());
    //     }
    //   };
    // }

    @Bean
    CommandLineRunner initDatabase(DavisRepository repository) {
      return args -> {
        log.info("Preloading " + repository.save(new Davis("02.06.22	12:10	21.9	21.9	21.9	59	13.6	0.0	---	0.00	0.0	---	21.9	21.8	21.8	25.6	1026.5	0.00	0.0	373	5.35	373	3.2	0.23	3.2	0.000	0.025	25.4	48	13.6	25.2	8.90	1.1803	0.00	7	4	3	4	17.8	13.3	12.2	11.7	0	4	0.0	10")));
        log.info("Preloading " + repository.save(new Davis("02.06.22	12:20	22.1	22.1	21.9	62	14.4	0.0	---	0.00	0.0	---	22.1	22.0	22.0	26.1	1026.4	0.00	0.0	401	5.75	459	3.3	0.24	3.5	0.000	0.026	25.8	47	13.6	25.6	8.68	1.1787	0.00	7	4	3	4	17.8	13.3	12.2	11.7	0	4	0.0	10")));
      };
    }
}
