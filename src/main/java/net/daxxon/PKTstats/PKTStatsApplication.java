package net.daxxon.PKTstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PKTStatsApplication {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(PKTStatsApplication.class, args);
  }
}
//
//  HTTPClient pktClient = new HTTPClient();
//
//      pktClient.sendGet();
//        System.out.println("Testing 1 - Send Http GET request");
