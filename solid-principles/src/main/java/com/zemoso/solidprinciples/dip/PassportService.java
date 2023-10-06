package com.zemoso.solidprinciples.dip;

// Dependency Inversion Principle (DIP)

// Abstractions should not depend on details; details should depend on abstractions.

import com.zemoso.solidprinciples.isp.PassportApplicant;
import com.zemoso.solidprinciples.isp.PassportIssuer;

// Using abstractions (interfaces) to decouple high-level and low-level modules
public class PassportService {

    private PassportApplicant applicant;
    private PassportIssuer issuer;

    public PassportService(PassportApplicant applicant, PassportIssuer issuer) {
        this.applicant = applicant;
        this.issuer = issuer;
    }

    public void processPassportApplication() {
        applicant.fillApplicationForm();
        applicant.submitApplication();
        issuer.issuePassport();
    }
}
