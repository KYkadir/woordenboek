package org.example.woordenboek.services.mappers;

import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.data.entities.LanguageEntity;

public interface LanguageMapper {

    LanguageEntity toEntity(LanguageDto req);

    LanguageEntity toEntity(LanguageUpdateDto req);

    LanguageEntity toEntity(LanguageCreateDto req);

    LanguageEntity toEntity(LanguageDeleteDto req);
}

