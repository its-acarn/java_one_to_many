package com.codeclan.example.MM2MHW;

import com.codeclan.example.MM2MHW.repositories.FileRepo;
import com.codeclan.example.MM2MHW.repositories.FolderRepo;
import com.codeclan.example.MM2MHW.repositories.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired
	FolderRepo folderRepo;

	@Autowired
	FileRepo fileRepo;

	@Autowired
	UserRepo userRepo;

	@Test
	void contextLoads() {
	}

}
