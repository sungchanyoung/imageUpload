package com.korit.fileupload_back.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileUploadService {
   public String uploadFile(MultipartFile file){
       if(file == null ){ return null; }

       String newFileName = UUID.randomUUID().toString()+ "_" + file.getOriginalFilename();
       String rootPath = "C:/cksdud/upload";
       String filePath = "profile/" + newFileName;

       File f = new File(rootPath,"");
       if(!f.exists()){f.mkdir();}

       Path uploadPath = Paths.get(rootPath + filePath);
       try{
           Files.write(uploadPath, file.getBytes());

       } catch (Exception e) {
            e.printStackTrace();
       }
       return filePath;
   }


}
