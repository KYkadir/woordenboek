package org.example.woordenboek.data.dtos;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDto {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String code;
    @NotNull
    private String flagUrl;
    @NotNull
    private boolean active;

    public LanguageDto(String name, String code, String flagUrl, boolean active) {
        this.name = name;
        this.code = code;
        this.flagUrl = flagUrl;
        this.active = active;
    }
}
