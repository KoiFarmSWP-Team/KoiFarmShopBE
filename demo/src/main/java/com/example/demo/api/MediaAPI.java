package com.example.demo.api;

import com.example.demo.Entity.Media;
import com.example.demo.Service.ImageUploadingService;
import com.example.demo.Service.MediaService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@SecurityRequirement(name = "/api")
public class MediaAPI
{
    @Autowired
    ImageUploadingService imageUploadingService;

    @Autowired
    MediaService mediaService;

    //add 1 file
    @PostMapping(value = "/api/media", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public ResponseEntity<String> addOneFile(@RequestParam("file") MultipartFile file)
    {
//        Media newMedia = new Media();
//        newMedia.setUrl(imageUploadingService.upload(file));
        String url = imageUploadingService.upload(file);
        return ResponseEntity.ok(url);
    }
}
