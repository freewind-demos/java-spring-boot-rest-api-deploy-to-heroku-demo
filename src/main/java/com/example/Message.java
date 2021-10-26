package com.example;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

public class Message {

    @NotBlank(message = "Message is not provided")
    @Pattern(regexp = "^\\w+$", message = "必须为常见字符")
    public String text;
}
