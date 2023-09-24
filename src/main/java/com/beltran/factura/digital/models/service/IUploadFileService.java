package com.beltran.factura.digital.models.service;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;

public interface IUploadFileService {
    Resource load(String filename) throws MalformedURLException;
    String copy(MultipartFile file) throws IOException;
    boolean delete(String filenme);
    void deleteAll();
    void init()throws IOException;
}
