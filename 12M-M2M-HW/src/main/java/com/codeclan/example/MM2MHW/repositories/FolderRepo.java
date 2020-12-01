package com.codeclan.example.MM2MHW.repositories;

import com.codeclan.example.MM2MHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Long> {
}
