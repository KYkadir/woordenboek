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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_id", unique = true)
    private Long id;

    @Column(name = "word")
    private String word;

    @Column(name = "word_meaning")
    private String meaning;


}
