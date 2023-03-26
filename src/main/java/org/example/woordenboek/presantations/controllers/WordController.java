package org.example.woordenboek.presantations.controllers;

import lombok.RequiredArgsConstructor;
import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.WordEntity;
import org.example.woordenboek.data.repositories.WordRepository;
import org.example.woordenboek.services.exceptions.WordException;
import org.example.woordenboek.services.flows.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/itword")
public class WordController {
    @Autowired
    private WordRepository wordRepository;
    private WordService wordService;

    @PostMapping("/create")
    public void createWord(@RequestBody WordCreateDto req) {
        wordService.createWord(req);
    }

    @GetMapping("/findAll")
    public List<WordEntity> findAll() {
        return wordRepository.findAll();
    }

    @GetMapping("/findById")
    public ResponseEntity<Long> findWordById(@RequestParam Long id) throws WordException {
        Long result = wordService.searchWordById(new WordSearchByIdDto(id));
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update")
    public void updateWord(@RequestBody WordUpdateDto req) {
        wordService.updateWord(req);
    }

    @DeleteMapping("/delete")
    public void deleteWord(@RequestBody WordDeleteDto req) {
        wordService.deleteWord(req);
    }

    @GetMapping("/findByWordOrTranslation")
    public ResponseEntity<WordResponseDto> findByWordOrTranslation(@RequestBody WordSearchEnglishOrDutchDto req) throws WordException {
        Long id = wordService.searchWordEnglishOrDutch(req);
        WordEntity wordEntity = wordRepository.findById(id).get();
        WordResponseDto wordResponseDto = new WordResponseDto(wordEntity.getId(), wordEntity.getWord(), wordEntity.getMeaning());
        return ResponseEntity.ok(wordResponseDto);
    }
}
