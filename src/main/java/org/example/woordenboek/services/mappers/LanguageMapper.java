package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.WordCreateDto;
import org.example.woordenboek.data.dtos.WordDeleteDto;
import org.example.woordenboek.data.dtos.WordDto;
import org.example.woordenboek.data.dtos.WordUpdateDto;
import org.example.woordenboek.data.entities.LanguageEntity;

public interface LanguageMapper {
    LanguageEntity toEntity(WordCreateDto req);

    LanguageEntity toEntity(WordDto req);

    LanguageEntity toEntity(WordUpdateDto req);

    LanguageEntity toEntity(WordDeleteDto req);
}

