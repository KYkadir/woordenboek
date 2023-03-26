package org.example.woordenboek.services.flows;

import lombok.RequiredArgsConstructor;
import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.WordRepository;
import org.example.woordenboek.services.exceptions.WordException;
import org.example.woordenboek.services.mappers.WordMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class WordServiceImpl implements WordService {
    private final WordRepository wordRepository;
    private final WordMapper mapper;

    public WordServiceImpl(WordRepository wordRepository, WordMapper mapper) {
        this.wordRepository = wordRepository;
        this.mapper = mapper;
    }

    @Override
    public Long createWord(WordCreateDto req) throws WordException {
        WordEntity entity = mapper.toEntity(req);
        WordEntity updated = wordRepository.save(entity);
        return updated.getId();
    }

    @Override
    public Long searchWordById(WordSearchByIdDto req) throws WordException {
        Long id = req.getId();
        if (!wordRepository.existsById(id)) {
            throw new WordException("Word not found");
        }
        return id;
    }

    @Override
    public Long searchWordEnglishOrDutch(WordSearchEnglishOrDutchDto req) throws WordException {
        List<WordEntity> wordEntities = wordRepository.findByWordOrMeaning(req.getWord(), req.getMeaning());
        if (wordEntities.isEmpty()) {
            throw new WordException("Word not found");
        } else if (wordEntities.size() > 1) {
            throw new WordException("More than one word found with the same name and meaning");
        } else {
            return wordEntities.get(0).getId();
        }
    }


    @Override
    public Long updateWord(WordUpdateDto req) throws WordException {
        WordEntity entity = mapper.toEntity(req);
        WordEntity updated = wordRepository.save(entity);
        return updated.getId();
    }

    @Override
    public Long deleteWord(WordDeleteDto req) throws WordException {
        WordEntity entity = mapper.toEntity(req);
        Long id = entity.getId();
        if (!wordRepository.existsById(id)) {
            throw new WordException("Word not found");
        }
        wordRepository.deleteById(id);
        return id;
    }

    @Override
    public List<WordResponseDto> getAllWord() {
        List<WordEntity> wordEntities = wordRepository.findAll();
        List<WordResponseDto> wordDtos = new ArrayList<>();
        for (WordEntity wordEntity : wordEntities) {
            WordResponseDto wordResponseDto = new WordResponseDto(wordEntity.getId(), wordEntity.getWord(), wordEntity.getMeaning());
            wordDtos.add(wordResponseDto);
        }
        return wordDtos;
    }
}
