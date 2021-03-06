package org.interledger.ilqp.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.interledger.ilp.InterledgerAddress;
import org.interledger.ilp.ledger.model.MessageData;

import java.util.Set;

/**
 * The JSON representation of a ILQP Quote Request. 
 */
@JsonInclude(value = Include.NON_NULL)
public class JsonQuoteRequest implements MessageData {
  
  private String sourceAddress;
  private String sourceAmount;
  private long sourceExpiryDuration;
  private String destinationAmount;
  private String destinationAddress;
  private long destinationExpiryDuration;
  private String destinationPrecision;
  private String destinationScale;
  private Set<InterledgerAddress> connectors;
  
  @JsonProperty("source_address")
  public String getSourceAddress() {
    return sourceAddress;
  }

  @JsonProperty("source_amount")
  public String getSourceAmount() {
    return sourceAmount;
  }

  @JsonProperty("source_expiry_duration")
  public long getSourceExpiryDuration() {
    return sourceExpiryDuration;
  }
  
  @JsonProperty("destination_amount")
  public String getDestinationAmount() {
    return destinationAmount;
  }
  
  @JsonProperty("destination_address")
  public String getDestinationAddress() {
    return destinationAddress;
  }
  
  @JsonProperty("destination_expiry_duration")
  public long getDestinationExpiryDuration() {
    return destinationExpiryDuration;
  }
  
  //TODO: not in https://interledger.org/rfcs/0008-interledger-quoting-protocol/ ??
  @JsonProperty("destination_precision")
  public String getDestinationPrecision() {
    return destinationPrecision;
  }

  //TODO: not in https://interledger.org/rfcs/0008-interledger-quoting-protocol/ ??
  @JsonProperty("destination_scale")
  public String getDestinationScale() {
    return destinationScale;
  }
  
  public Set<InterledgerAddress> getConnectors() {
    return connectors;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }

  public void setSourceAmount(String sourceAmount) {
    this.sourceAmount = sourceAmount;
  }

  public void setSourceExpiryDuration(long sourceExpiryDuration) {
    this.sourceExpiryDuration = sourceExpiryDuration;
  }

  public void setDestinationAmount(String destinationAmount) {
    this.destinationAmount = destinationAmount;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public void setDestinationExpiryDuration(long destinationExpiryDuration) {
    this.destinationExpiryDuration = destinationExpiryDuration;
  }

  public void setDestinationPrecision(String destinationPrecision) {
    this.destinationPrecision = destinationPrecision;
  }

  public void setDestinationScale(String destinationScale) {
    this.destinationScale = destinationScale;
  }

  public void setConnectors(Set<InterledgerAddress> connectors) {
    this.connectors = connectors;
  }

}
