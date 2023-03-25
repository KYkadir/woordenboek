package org.example.woordenboek.data.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordListDto {
    private List<WordDto> words;
}
