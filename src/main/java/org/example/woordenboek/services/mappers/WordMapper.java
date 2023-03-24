package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.WordCreateDto;
import org.example.woordenboek.data.dtos.WordDeleteDto;
import org.example.woordenboek.data.dtos.WordDto;
import org.example.woordenboek.data.dtos.WordUpdateDto;
import org.example.woordenboek.data.entities.WordEntity;

public interface WordMapper {
    WordEntity toEntity(WordCreateDto req);
    WordEntity toEntity(WordDto req);
    WordEntity toEntity(WordUpdateDto req);
    WordEntity toEntity(WordDeleteDto req);
}
