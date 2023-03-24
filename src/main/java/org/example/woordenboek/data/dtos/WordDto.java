package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import org.example.woordenboek.data.entities.LanguageEntity;

public class WordDto {private Long id;

    @NotNull
    private String name;

    @NotNull
    private String definition;

    @NotNull
    private LanguageEntity language;

    public WordDto(String name, String definition, LanguageEntity language) {
        this.name = name;
        this.definition = definition;
        this.language = language;
    }
}
