package com.BBC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BBC.Services.CustomerServices;

@RestController
public class CustomerController {
@Autowired
CustomerServices customerServices;
}
