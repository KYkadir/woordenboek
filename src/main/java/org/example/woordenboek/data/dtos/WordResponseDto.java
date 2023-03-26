package org.example.woordenboek.data.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
@Getter
@Setter
@Value
public class WordResponseDto {
    Long id;
    String word;
    String meaning;
}
