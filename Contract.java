package buem.darovykh.summerschool.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contract {
    private String number;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description;
    private Integer sumInsured;
    private Integer tariffRate;
    private Branch branch;
    private InsuranceType insuranceType;
    private Agent agent;
    private Client client;

    public Contract() {
    }

    public Contract(String description, InsuranceType insuranceType) {
        this.description = description;
        this.insuranceType = insuranceType;
    }

    public Contract(String number, LocalDateTime createdAt, LocalDateTime updatedAt, String description,
                    Integer sumInsured, Integer tariffRate, Branch branch, InsuranceType insuranceType,
                    Agent agent, Client client) {
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
        this.sumInsured = sumInsured;
        this.tariffRate = tariffRate;
        this.branch = branch;
        this.insuranceType = insuranceType;
        this.agent = agent;
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(Integer sumInsured) {
        this.sumInsured = sumInsured;
    }

    public Integer getTariffRate() {
        return tariffRate;
    }

    public void setTariffRate(Integer tariffRate) {
        this.tariffRate = tariffRate;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return number.equals(contract.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", description='" + description + '\'' +
                ", sumInsured=" + sumInsured +
                ", tariffRate=" + tariffRate +
                ", branch=" + branch +
                ", insuranceType=" + insuranceType +
                ", agent=" + agent +
                ", client=" + client +
                '}';
    }
}
