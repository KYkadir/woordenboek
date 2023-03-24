package org.example.woordenboek.services.flows;

import org.example.woordenboek.data.dtos.WordCreateDto;
import org.example.woordenboek.data.dtos.WordUpdateDto;
import org.example.woordenboek.data.entities.LanguageEntity;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.LanguageRepository;
import org.example.woordenboek.data.repositories.WordRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class WordService {
    private final WordRepository wordRepository;
    private final LanguageRepository languageRepository;

    public WordService(WordRepository wordRepository, LanguageRepository languageRepository) {
        this.wordRepository = wordRepository;
        this.languageRepository = languageRepository;
    }
    public List<WordEntity> getAllWords() {
        return wordRepository.findAll();
    }

    public Optional<WordEntity> getWordById(Long id) {
        return wordRepository.findById(id);
    }

    public WordEntity createWord(WordCreateDto wordCreateDto) {
        LanguageEntity language = languageRepository.findById(wordCreateDto.getLanguageId())
                .orElseThrow(() -> new EntityNotFoundException("Language not found"));

        WordEntity word = new WordEntity();
        word.setValue(wordCreateDto.getWord());
        word.setMeaning(wordCreateDto.getMeaning());
        word.setLanguage(language);
        word.setActive(true);

        return wordRepository.save(word);
    }

    public WordEntity updateWord(Long id, WordUpdateDto wordUpdateDto) {
        LanguageEntity language = languageRepository.findById(wordUpdateDto.getLanguageId())
                .orElseThrow(() -> new EntityNotFoundException("Language not found"));

        WordEntity word = wordRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Word not found"));

        word.setValue(wordUpdateDto.getWord());
        word.setMeaning(wordUpdateDto.getMeaning());
        word.setLanguage(language);

        return wordRepository.save(word);
    }

    public void deleteWord(Long id) {
        WordEntity word = wordRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Word not found"));

        wordRepository.delete(word);
    }
}
