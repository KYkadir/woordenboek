package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordSearchDto {
    @NotNull
    private String searchTerm;
    @NotNull
    private LanguageDto language;
}
