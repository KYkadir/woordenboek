package org.example.woordenboek.data.repositories;

import org.example.woordenboek.data.entities.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<WordEntity, Long> {
    List<WordEntity> findByWordOrMeaning(String word, String meaning);


}
