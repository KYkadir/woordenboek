package org.example.woordenboek.data.dtos;
import lombok.*;

@Value
public class WordUpdateDto {

        Long id;
        String word;
        String meaning;

}
