package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordUpdateDto {
      @NotNull
      private Long id;

      @NotNull
      @Size(max = 100, message = "The maximum length of the word should be 100.")
      private String word;

      @NotNull
      private String meaning;

      @NotNull
      private Long languageId;
}
