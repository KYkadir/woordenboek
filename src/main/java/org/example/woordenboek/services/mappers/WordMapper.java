package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.WordEntity;

public interface WordMapper {
    WordEntity toEntity(WordCreateDto req);

    WordEntity toEntity(WordDto req);

    WordEntity toEntity(WordUpdateDto req);

    WordEntity toEntity(WordDeleteDto req);

    WordEntity toEntity(WordSearchDto req);

}
