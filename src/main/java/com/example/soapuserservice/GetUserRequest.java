package com.example.soapuserservice;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getUserRequest", namespace = "http://example.com/users")
public class GetUserRequest {

    private Long id;

    @XmlElement(namespace = "http://example.com/users")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
