package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import lombok.*;
import org.example.woordenboek.data.entities.LanguageEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordDto {
    private Long id;

    @NotNull
    private String word;

    @NotNull
    private String meaning;

    @NotNull
    private LanguageEntity language;

    public WordDto(String name, String definition, LanguageEntity language) {
        this.word = word;
        this.meaning = meaning;
        this.language = language;
    }
}
