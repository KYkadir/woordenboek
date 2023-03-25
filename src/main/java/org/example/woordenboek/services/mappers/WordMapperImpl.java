package org.example.woordenboek.services.mappers;
import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.LanguageEntity;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.WordRepository;
import org.example.woordenboek.data.repositories.LanguageRepository;
import org.example.woordenboek.services.exceptions.WordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WordMapperImpl implements WordMapper {

    @Override
    public WordEntity toEntity(WordCreateDto req) {
        WordEntity entity=new WordEntity();

        entity.setMeaning(req.getMeaning());
        entity.s
    }

    @Override
    public WordEntity toEntity(WordDto req) {
        if (req == null) {
            throw new WordException("WordDto object is null.");
        }
        return new WordEntity(req.getId(), req.getWord(), req.getLanguageId());
    }

    @Override
    public WordEntity toEntity(WordUpdateDto req) {
        if (req == null) {
            throw new WordException("WordUpdateDto object is null.");
        }
        return new WordEntity(req.getId(), req.getWord(), req.getLanguageId());
    }

    @Override
    public WordEntity toEntity(WordDeleteDto req) {
        if (req == null) {
            throw new WordException("WordDeleteDto object is null.");
        }
        return new WordEntity(req.getId());
    }

    @Override
    public WordEntity toEntity(WordSearchDto req) {
        WordEntity entity=new WordEntity();
        if (req == null) {
            throw new WordException("WordSearchDto object is null.");
        }
        return new WordEntity(req.getSearchTerm(), req.getLanguage().getCode());
    }}