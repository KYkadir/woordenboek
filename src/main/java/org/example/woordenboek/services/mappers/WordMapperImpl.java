package org.example.woordenboek.services.mappers;
import org.example.woordenboek.data.dtos.WordCreateDto;
import org.example.woordenboek.data.dtos.WordDeleteDto;
import org.example.woordenboek.data.dtos.WordDto;
import org.example.woordenboek.data.dtos.WordUpdateDto;
import org.example.woordenboek.data.entities.LanguageEntity;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.WordRepository;
import org.example.woordenboek.data.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WordMapperImpl implements WordMapper {
    LanguageRepository languageRepository;

    @Override
    public WordEntity toEntity(WordCreateDto req) {
        LanguageEntity language = languageRepository.findById(req.getLanguageId()).orElseThrow(() ->
                new IllegalArgumentException("Language with provided ID does not exist"));

        return new WordEntity(null, req.getWord(), req.getMeaning(), language, true);
    }

    @Override
    public WordEntity toEntity(WordDto req) {
        Language language = req.getLanguage();

        return new WordEntity(req.getId(), req.getName(), req.getDefinition(), language, true);
    }

    @Override
    public WordEntity toEntity(WordUpdateDto req) {
        return null;
    }

    @Override
    public WordEntity toEntity(WordDeleteDto req) {
        return null;
    }
}
