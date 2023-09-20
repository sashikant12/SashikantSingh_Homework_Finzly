package com.BBC.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BBC.Dao.CustomerDao;

@Service
public class CustomerServices {
@Autowired
CustomerDao customerDao;
}
