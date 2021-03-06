package com.greenfox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class Response {

  String status;
  String message;

  public String getStatus() {
    return status;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setErrorMessage(List<String> errorMessage) {
    this.message = "Missing field(s): ";
    for (String entry : errorMessage) {
      this.message += entry + ", ";
    }
    this.message = this.message.substring(0, this.message.length() - 2);
  }

  public String getMessage() {
    return message;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
