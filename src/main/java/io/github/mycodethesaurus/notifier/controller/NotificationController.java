package io.github.mycodethesaurus.notifier.controller;

import io.github.mycodethesaurus.notifier.dto.NotificationRequestPayload;
import io.github.mycodethesaurus.notifier.dto.SubscriberNotificationPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.time.LocalDateTime;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
@RequestMapping("/v1")
public class NotificationController {

  @Autowired RestClient restClient;

  @PostMapping("/notify")
  public String setNotification(@RequestBody NotificationRequestPayload notification) {

    SubscriberNotificationPayload payload =
        new SubscriberNotificationPayload(
            notification.getMessage(), LocalDateTime.now().toString());
    ResponseEntity<Void> response =
        restClient
            .post()
            .uri(notification.getRecipientUrl())
            .contentType(APPLICATION_JSON)
            .body(payload)
            .retrieve()
            .toBodilessEntity();
    return "Notification sent to " + notification.getRecipientUrl();
  }
}
