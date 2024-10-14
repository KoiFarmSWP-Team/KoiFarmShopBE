package com.example.demo.Service;

import com.example.demo.Entity.Media;
import com.example.demo.Entity.Variety;
import com.example.demo.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService
{
    @Autowired
    MediaRepository mediaRepository;

    //create
    public Media createNewMedia(Media Media)
    {
        return mediaRepository.save(Media);
    }

}
