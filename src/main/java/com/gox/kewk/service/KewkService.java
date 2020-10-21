package com.gox.kewk.service;

import com.gox.kewk.entity.Kewk;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KewkService {

    private List<Kewk> kewks = Arrays.asList(
            new Kewk(1, "josé", 22),
            new Kewk(2, "marcel", 35),
            new Kewk(3, "francis", 17),
            new Kewk(4, "raoul", 47),
            new Kewk(5, "edgard", 58),
            new Kewk(6, "paulo", 99)
    );

    public List<Kewk> getAllKewk(){
        return kewks.stream()
                .filter(e -> e.getValue() < 30)
                .collect(Collectors.toList());
    }

    public List<Kewk> getAllGods(){
        return kewks;
    }
}
