package com.wwc.explorer.issues;


import lombok.*;


@Getter
@Setter
@Data
@Builder
class Issue {

    private String title;
    private String [] labels;
    private String repositoryTitle;
    private String [] repositoryLabels;
    private String repositoryUrl;
    private String language;

}
