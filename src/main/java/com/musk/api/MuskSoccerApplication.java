package com.musk.api;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MuskSoccerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuskSoccerApplication.class, args);

    }
    // @Bean
    //     JPAQueryFactory jpaQueryFactory(EntityManager manager) {
    //         return new JPAQueryFactory(manager);
    //     }

}
