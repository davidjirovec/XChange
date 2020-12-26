package org.knowm.xchange.kraken.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.StringJoiner;

public class KrakenSystemStatus {

  private final KrakenStatus status;
  private final Date timestamp;

  public KrakenSystemStatus(
          @JsonProperty("status") final KrakenStatus status, @JsonProperty("timestamp") final Date timestamp
  ) {
    this.status = status;
    this.timestamp = timestamp;
  }

  public KrakenStatus getStatus() {
    return status;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", KrakenSystemStatus.class.getSimpleName() + "[", "]")
            .add("status=" + status)
            .add("timestamp=" + timestamp)
            .toString();
  }
}
