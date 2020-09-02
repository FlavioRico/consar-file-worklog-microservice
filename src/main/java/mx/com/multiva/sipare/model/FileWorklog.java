package mx.com.multiva.sipare.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sipare_consar_files_metadata")
public class FileWorklog {
    @Id
    @JsonProperty("dispatch_date")
    private String dispatchDate;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("records_number")
    private int recordsNumber;
    private int status;
    @JsonProperty("payment_date")
    private String paymentDate;
    private String timestamp;

    public String getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getRecordsNumber() {
        return recordsNumber;
    }

    public void setRecordsNumber(int recordsNumber) {
        this.recordsNumber = recordsNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
