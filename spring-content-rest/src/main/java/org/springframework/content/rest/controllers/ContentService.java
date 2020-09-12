package org.springframework.content.rest.controllers;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import internal.org.springframework.content.rest.controllers.MethodNotAllowedException;

public interface ContentService {

    void getContent(HttpServletRequest request, HttpServletResponse response, HttpHeaders headers, String requestedMimeTypes, Resource resource, MediaType resourceType)
            throws MethodNotAllowedException;

    void setContent(HttpHeaders headers, InputStream content, MediaType mimeType, String originalFilename, Resource target) throws IOException, MethodNotAllowedException;

    void unsetContent(Resource resource) throws MethodNotAllowedException;
}
