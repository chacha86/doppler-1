package org.example.doppler1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @PostMapping("/save")
    public TestEntity save() {
        TestEntity testEntity = TestEntity.builder().content("content").build();
        return testRepository.save(testEntity);
    }

    @GetMapping("/show")
    public List<TestEntity> show() {
        return testRepository.findAll();
    }
}
