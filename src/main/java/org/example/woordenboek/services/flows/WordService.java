package org.example.woordenboek.services.flows;

import org.example.woordenboek.data.dtos.*;
import org.example.woordenboek.services.exceptions.WordException;

import java.util.List;

public interface WordService {
Long createWord(WordCreateDto req)throws WordException;
Long searchWordById(WordSearchByIdDto req)throws WordException;
Long searchWordEnglishOrDutch(WordSearchEnglishOrDutchDto req)throws WordException;
Long updateWord(WordUpdateDto req)throws WordException;
Long deleteWord(WordDeleteDto req)throws WordException;

List<WordResponseDto> getAllWord();
}
