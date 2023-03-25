package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageUpdateDto {
    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String code;

    @NotNull
    private String flagUrl;

    @NotNull
    private boolean active;
}