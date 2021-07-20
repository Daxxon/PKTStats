package net.daxxon.PKTstats;

public class Application {
  public static void main(String[] args) throws Exception {
    HTTPClient pktClient = new HTTPClient();

    System.out.println("Testing 1 - Send Http GET request");
    pktClient.sendGet();

//    System.out.println("Testing 2 - Send Http POST request");
//    pktClient.sendPost();

  }
}
