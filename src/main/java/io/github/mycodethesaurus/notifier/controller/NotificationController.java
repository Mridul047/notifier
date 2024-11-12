package io.github.mycodethesaurus.notifier.controller;

import io.github.mycodethesaurus.notifier.dto.NotificationRequestPayload;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class NotificationController {

  @PostMapping("/notify")
  public String setNotification(@RequestBody NotificationRequestPayload notification) {
    return null;
  }
}
