package com.codeclan.example.MM2MHW.components;

import com.codeclan.example.MM2MHW.models.File;
import com.codeclan.example.MM2MHW.models.Folder;
import com.codeclan.example.MM2MHW.models.User;
import com.codeclan.example.MM2MHW.repositories.FileRepo;
import com.codeclan.example.MM2MHW.repositories.FolderRepo;
import com.codeclan.example.MM2MHW.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner  {

    @Autowired
    FolderRepo folderRepo;

    @Autowired
    FileRepo fileRepo;

    @Autowired
    UserRepo userRepo;

    public Dataloader(){}

    public void run(ApplicationArguments args) {

        User andrew = new User("Andrew");
        userRepo.save(andrew);
        User sam = new User("Sam");
        userRepo.save(sam);
        User nathan = new User("Nathan");
        userRepo.save(nathan);
        User rabbie = new User("Rabbie");
        userRepo.save(rabbie);

        Folder folder1 = new Folder("one", andrew);
        folderRepo.save(folder1);
        Folder folder2 = new Folder("two", sam);
        folderRepo.save(folder2);
        Folder folder3 = new Folder("three", rabbie);
        folderRepo.save(folder3);

        File file1 = new File("file1", ".txt", 23.4, folder1);
        fileRepo.save(file1);
        File file2 = new File("file2", ".xlsx", 18.2, folder1);
        fileRepo.save(file2);
        File file3 = new File("file3", ".docx", 0.44, folder1);
        fileRepo.save(file3);
        File file4 = new File("file4", ".py", 1.2, folder1);
        fileRepo.save(file4);



    }
}
