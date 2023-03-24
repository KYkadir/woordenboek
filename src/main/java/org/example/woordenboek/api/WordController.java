package org.example.woordenboek.api;

import org.example.woordenboek.data.dtos.WordCreateDto;
import org.example.woordenboek.data.dtos.WordDto;
import org.example.woordenboek.data.dtos.WordUpdateDto;
import org.example.woordenboek.services.flows.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/words")
public class WordController {
    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/")
    public ResponseEntity<List<WordDto>> getAllWords() {
        List<WordDto> words = wordService.getAllWords();
        return ResponseEntity.ok(words);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WordDto> getWordById(@PathVariable Long id) {

        return ResponseEntity.ok(word);
    }

    @PostMapping("/")
    public ResponseEntity<WordDto> createWord(@Valid @RequestBody WordCreateDto wordCreateDto) {
        WordDto word = wordService.createWord(wordCreateDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(word);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WordDto> updateWord(@PathVariable Long id, @Valid @RequestBody WordUpdateDto wordUpdateDto) {
        WordDto word = wordService.updateWord(id, wordUpdateDto);
        return ResponseEntity.ok(word);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWord(@PathVariable Long id) {
        wordService.deleteWord(id);
        return ResponseEntity.noContent().build();
    }
}
