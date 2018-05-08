package com.exlibris.springwebdemo.sevices;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ProphetServiceImpl implements ProphetService {
    @Override
    public boolean willSurvive(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
