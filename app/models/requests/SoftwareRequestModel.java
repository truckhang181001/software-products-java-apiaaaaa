package models.requests;

import java.time.Instant;

public class SoftwareRequestModel {
    private Long id;
    private Long companyId;
    private String name;
    private Instant introduced;
    private Instant discontinued;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getIntroduced() {
        return introduced;
    }

    public void setIntroduced(Instant introduced) {
        this.introduced = introduced;
    }

    public Instant getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Instant discontinued) {
        this.discontinued = discontinued;
    }
}
