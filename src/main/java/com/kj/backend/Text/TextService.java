package com.kj.backend.Text;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TextService {

    private final TextRepository textRepository;

    public TextService(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    public Optional<Text> getText(String id) {
        return textRepository.findById(id);
    }

    public Text createText(Text text) {
        return textRepository.save(text);
    }

    public Text updateText(String id, Text text) {
        text.setId(id);
        return textRepository.save(text);
    }

    public void deleteText(String id) {
        textRepository.deleteById(id);
    }
}
