package io.github.mycodethesaurus.notifier.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberNotificationPayload {
  private String message;
  private String pushedOnUTC;
}
