package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDeleteDto {
    @NotNull
    private Long id;
}
