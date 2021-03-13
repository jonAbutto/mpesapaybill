package com.payment.mpesa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MpesaPayBillApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MpesaPayBillApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("lipa na mpesa project");
    }
}
