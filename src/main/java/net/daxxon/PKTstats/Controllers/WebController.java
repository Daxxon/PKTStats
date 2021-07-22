package net.daxxon.PKTstats.Controllers;

import net.daxxon.PKTstats.HTTPClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

  @RequestMapping("/")
  public String home(Model model) {
    HTTPClient httpClient = new HTTPClient();
    return httpClient.getStats();
  }
}