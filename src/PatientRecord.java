/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maks
 */
import java.util.ArrayList;
import java.util.List;

public class PatientRecord {

    private List<ClinicRegistry> records = new ArrayList<>();

    // Добавить пациента
    public void registerPatient(ClinicRegistry record) {

        records.add(record);

        System.out.println(
                "Пациент зарегистрирован: "
                + record.getRequestId()
        );
    }

    // Удалить пациента
    public boolean removePatient(String requestId) {

        return records.removeIf(
                r -> r.getRequestId().equals(requestId)
        );
    }

    // Найти пациента
    public ClinicRegistry findPatient(String requestId) {

        for (ClinicRegistry r : records) {

            if (r.getRequestId().equals(requestId)) {
                return r;
            }
        }

        return null;
    }

    // Вывести всех пациентов
    public void printAllPatients() {

        if (records.isEmpty()) {

            System.out.println("Нет записей.");
            return;
        }

        System.out.println("=== Реестр пациентов ===");

        for (ClinicRegistry r : records) {
            System.out.println(r);
        }
    }

    // Обновить статус доставки
    public void updateDeliveryStatus(
            String requestId,
            String status
    ) {

        ClinicRegistry r = findPatient(requestId);

        if (r != null) {
            r.setDeliveryStatus(status);
        }
    }

    // Обновить статус результата
    public void updateResultStatus(
            String requestId,
            String status
    ) {

        ClinicRegistry r = findPatient(requestId);

        if (r != null) {
            r.setResultStatus(status);
        }
    }

    // Главный метод
    public static void main(String[] args) {

        PatientRecord registry = new PatientRecord();

        // Создание пациентов
        ClinicRegistry p1 = new ClinicRegistry(
                "001",
                "Иван Иванов",
                "15.05.2026",
                "10:30",
                "Анализ крови",
                "Отправлен",
                "Готов"
        );

        ClinicRegistry p2 = new ClinicRegistry(
                "002",
                "Мария Петрова",
                "16.05.2026",
                "11:00",
                "ПЦР",
                "В обработке",
                "Не готов"
        );

        // Добавление пациентов
        registry.registerPatient(p1);
        registry.registerPatient(p2);

        // Вывод всех
        registry.printAllPatients();

        // Обновление статуса
        registry.updateResultStatus(
                "002",
                "Готов"
        );

        System.out.println("\nПосле обновления:\n");

        // Повторный вывод
        registry.printAllPatients();
    }
}