package org.knowm.xchange.kraken.dto.marketdata.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.kraken.dto.KrakenResult;
import org.knowm.xchange.kraken.dto.marketdata.KrakenSystemStatus;

public class KrakenSystemStatusResult extends KrakenResult<KrakenSystemStatus> {

  /**
   * Constructor
   *
   * @param error
   * @param result
   */
  public KrakenSystemStatusResult(
      @JsonProperty("error") String[] error, @JsonProperty("result") KrakenSystemStatus result) {

    super(result, error);
  }
}
