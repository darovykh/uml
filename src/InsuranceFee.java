package buem.darovykh.summerschool.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class InsuranceFee {
    private String code;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer sum;
    private Contract contract;

    public InsuranceFee() {
    }

    public InsuranceFee(String description, Contract contract) {
        this.description = description;
        this.contract = contract;
    }

    public InsuranceFee(String code, String description, LocalDateTime createdAt, LocalDateTime updatedAt,
                        Integer sum, Contract contract) {
        this.code = code;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.sum = sum;
        this.contract = contract;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuranceFee that = (InsuranceFee) o;
        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "InsuranceFee{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", sum=" + sum +
                ", contract=" + contract +
                '}';
    }
}
