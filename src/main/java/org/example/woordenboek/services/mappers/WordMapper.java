package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.WordEntity;

import java.util.List;

public interface WordMapper {
    WordEntity toEntity(WordCreateDto req);

    WordEntity toEntity(WordSearchEnglishOrDutchDto req);

    WordEntity toEntity(WordUpdateDto req);

    WordEntity toEntity(WordDeleteDto req);

    WordEntity toEntity(WordSearchByIdDto req);

    WordEntity toEntity(WordResponseDto req);

    List<WordResponseDto> getAllWords();




}
