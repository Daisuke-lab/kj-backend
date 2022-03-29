package com.kj.backend.Text;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/text")
public class TextController {

    private final TextService textService;

    public TextController(TextService textService) {
        this.textService = textService;

    }

    @GetMapping(path="{id}")
    public Optional<Text> getText(@PathVariable String id) {
        return textService.getText(id);
    }

    @PostMapping
    public Text createText(@RequestBody Text text) {
        return textService.createText(text);
    }

    @PutMapping(path="{id}")
    public Text updateText(@PathVariable String id, @RequestBody Text text) {
        return textService.updateText(id, text);
    }

    @DeleteMapping(path="{id}")
    public void deleteText(@PathVariable String id) {
        textService.deleteText(id);
    }
}
