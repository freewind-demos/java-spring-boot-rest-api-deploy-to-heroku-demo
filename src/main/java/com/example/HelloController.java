package com.example;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/messages")
public class HelloController {

    private Map<String, String> store = new HashMap<>();

    private Integer id = 0;

    private String newId() {
        return "" + this.id++;
    }

    @RequestMapping("/")
    public Map<String, String> index() {
        return store;
    }

    @GetMapping("/{id}")
    public String getMessage(@PathVariable String id) {
        return store.get(id);
    }

    @PostMapping("/")
    public String save(@RequestBody @Validated Message message) {
        String id = this.newId();
        store.put(id, message.text);
        return id;
    }

}
