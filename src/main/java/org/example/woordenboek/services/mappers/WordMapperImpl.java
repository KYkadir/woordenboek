package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.WordRepository;
import org.example.woordenboek.services.exceptions.WordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WordMapperImpl implements WordMapper {
    private WordRepository wordRepository;

    @Autowired
    public WordMapperImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public WordEntity toEntity(WordCreateDto req) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setWord(req.getWord());
        wordEntity.setMeaning(req.getMeaning());
        return wordEntity;
    }

    @Override
    public WordEntity toEntity(WordSearchEnglishOrDutchDto req) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setWord(req.getWord());
        wordEntity.setMeaning(req.getMeaning());
        return wordEntity;
    }

    @Override
    public WordEntity toEntity(WordUpdateDto req) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setWord(req.getWord());
        wordEntity.setMeaning(req.getMeaning());
        return wordEntity;
    }

    @Override
    public WordEntity toEntity(WordDeleteDto req) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setId(req.getId());
        return wordEntity;
    }

    @Override
    public WordEntity toEntity(WordSearchByIdDto req) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setId(req.getId());
        return wordEntity;
    }

    @Override
    public WordEntity toEntity(WordResponseDto req) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setId(req.getId());
        wordEntity.setWord(req.getWord());
        wordEntity.setMeaning(req.getMeaning());
        return wordEntity;

    }

    @Override
    public List<WordResponseDto> getAllWords() {

        List<WordEntity> wordEntities = wordRepository.findAll();
        List<WordResponseDto> wordResponseDtos = new ArrayList<>();
        for (WordEntity wordEntity : wordEntities) {
            wordResponseDtos.add(new WordResponseDto(wordEntity.getId(), wordEntity.getWord(), wordEntity.getMeaning()));
        }
        return wordResponseDtos;
    }
}
