package org.example.doppler1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class TestRepositoryTest {

    @Autowired
    private TestRepository testRepository;

    @Test
    void t1() {
        testRepository.save(TestEntity.builder()
                .content("test")
                .build());
    }

}
