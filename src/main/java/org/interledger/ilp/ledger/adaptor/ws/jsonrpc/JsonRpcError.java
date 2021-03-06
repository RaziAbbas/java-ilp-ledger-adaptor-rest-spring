package org.interledger.ilp.ledger.adaptor.ws.jsonrpc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error message as communicated via JSON-RPC.
 */
public class JsonRpcError {

  private int code;
  private String message;
  private Object data;

  @JsonProperty(value = "code")
  public int getCode() {
    return code;
  }

  @JsonProperty(value = "message")
  public String getMessage() {
    return message;
  }

  @JsonProperty(value = "data")
  public Object getData() {
    return data;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setData(Object data) {
    this.data = data;
  }
}

