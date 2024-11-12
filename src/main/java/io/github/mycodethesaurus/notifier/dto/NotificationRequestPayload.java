package io.github.mycodethesaurus.notifier.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequestPayload {
  private String message;
  private String recipientUrl;
  private String hourlyNotificationFrequency;
}
