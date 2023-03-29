package com.montaser.loans.model;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
    private List<String> activeBranches;
}
