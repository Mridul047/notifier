package io.github.mycodethesaurus.notifier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/v1")
public class PingController {
  public InetAddress ip;
  public String hostname;

  @GetMapping("/ping")
  public String ping() {
    return "Hello from AWS EC2";
  }

  @GetMapping("/host")
  public String getHostDetails() {

    try {
      ip = InetAddress.getLocalHost();
      hostname = ip.getHostName();
      System.out.println("Your current IP address : " + ip.getHostAddress());
      System.out.println("Your current Hostname : " + hostname);
    } catch (UnknownHostException e) {
      return "Exception occurred while processing the request: " + e.getMessage();
    }
    return """
      {"ip": "%s",
      "hostname": "%s"
      }"""
        .formatted(ip.getHostAddress(), hostname);
  }
}
