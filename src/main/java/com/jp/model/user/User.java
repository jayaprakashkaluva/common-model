package com.jp.model.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;
    private Address shippingAddress;
    private Address billingAddress;
}
