package com.wwc.explorer.issues;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.*;



@RestController
public class IssuesController {

    @RequestMapping("/")
    public String index() {
        return "Stay tuned. This service will soon start serving github issues for opensource newbies.";
    }

    @RequestMapping("/issues")
    public Issue issues() {
        return Issue.builder()
                .labels(new String[1])
                .language("java")
                .title("title")
                .repositoryLabels(new String[1])
                .repositoryTitle("repositoryTitle")
                .repositoryUrl("www.bla.de")
                .build();

    }


}
