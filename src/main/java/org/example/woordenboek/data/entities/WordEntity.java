package org.example.woordenboek.data.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "words")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordEntity {
    @Id
    @GeneratedValue
    @Column(name = "word_id", unique = true)
    private Long id;

    @NotNull
    @Column(name = "word_value")
    private String value;

    @NotNull
    @Column(name = "word_meaning")
    private String meaning;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private LanguageEntity language;

    @NotNull
    @Column(name = "is_active")
    private boolean active;

}
