package com.example.rabbitmq.demo.bean;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;

public class MyResource  extends FileSystemResource implements Serializable {

    public MyResource(File file) {
        super(file);
    }

}
