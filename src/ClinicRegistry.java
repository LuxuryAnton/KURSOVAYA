/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maks
 */
public class ClinicRegistry {

    private String requestId;       // Личный номер пациента
    private String patientName;     // Данные пациента
    private String appointmentDate; // Дата приема
    private String appointmentTime; // Время приема
    private String analysisType;    // Тип анализа
    private String deliveryStatus;  // Доставка анализов
    private String resultStatus;    // Результаты анализов
    
    // Конструктор
    public ClinicRegistry(String requestId,
                          String patientName,
                          String appointmentDate,
                          String appointmentTime,
                          String analysisType,
                          String deliveryStatus,
                          String resultStatus) {

        this.requestId = requestId;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.analysisType = analysisType;
        this.deliveryStatus = deliveryStatus;
        this.resultStatus = resultStatus;
    }

    // Геттеры
    public String getRequestId() {
        return requestId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getAnalysisType() {
        return analysisType;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    // Сеттеры
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    // Вывод информации
    @Override
    public String toString() {

        return "Личный номер пациента: " + requestId +
               ", Дата приема: " + appointmentDate +
               ", Время приема: " + appointmentTime +
               ", Данные пациента: " + patientName +
               ", Тип анализа: " + analysisType +
               ", Доставка анализов в лабораторию: " + deliveryStatus +
               ", Результаты анализов: " + resultStatus;
    }
}