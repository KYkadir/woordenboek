package org.example.woordenboek.data.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "languages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageEntity {

    @Id
    @GeneratedValue

    @Column(name = "language_id", unique = true)
    private Long id;

    @NotNull

    @Column(name = "language_name")
    private String name;

    @NotNull

    @Column(name = "language_code")
    private String code;

    @NotNull

    @Column(name = "language_flag_url")
    private String flagUrl;

    @NotNull
    @Column(name = "is_active")
    private boolean active;
}
