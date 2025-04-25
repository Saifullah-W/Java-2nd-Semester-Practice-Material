import com.github.javafaker.Faker;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class HealthcareDataGenerator {
    private static final Faker faker = new Faker();
    private static final Random rand = new Random();
    private static final SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        try {
            generatePatientRecords();
            generateBillingData();
            generatePharmacyData();
            generatePublicHealthData();
            System.out.println("Data generation completed successfully!");
        } catch (IOException e) {
            System.err.println("Error generating data: " + e.getMessage());
        }
    }

    private static void generatePatientRecords() throws IOException {
        try (FileWriter csv = new FileWriter("patient_records.csv")) {
            csv.write("patient_id,age,gender,visit_date,diagnosis_code,zip_code\n");
            for (int i = 0; i < 1000; i++) { // Reduced count for testing
                String diagnosis = rand.nextFloat() < 0.05 ? "" : "ICD10-" + faker.number().digits(3);
                csv.write(String.format("%d,%d,%s,%s,%s,%s\n",
                        i + 1,
                        faker.number().numberBetween(1, 100),
                        faker.options().option("M", "F", "O"),
                        isoFormat.format(faker.date().past(30, TimeUnit.DAYS)),
                        diagnosis,
                        faker.address().zipCode()
                ));
            }
        }
    }

    private static void generateBillingData() throws IOException {
        try (FileWriter csv = new FileWriter("billing_records.csv")) {
            csv.write("transaction_id,patient_id,procedure_cost,medication_cost,claim_date\n");
            for (int i = 0; i < 500; i++) { // Reduced count for testing
                csv.write(String.format("%d,%d,%.2f,%.2f,%s\n",
                        i + 1,
                        faker.number().numberBetween(1, 1000),
                        faker.number().randomDouble(2, 50, 5000),
                        faker.number().randomDouble(2, 10, 500),
                        isoFormat.format(faker.date().past(365, TimeUnit.DAYS))
                ));
            }
        }
    }

    private static void generatePharmacyData() throws IOException {
        try (FileWriter csv = new FileWriter("pharmacy_inventory.csv")) {
            csv.write("medication_id,stock_level,last_restock,patient_id\n");
            for (int i = 0; i < 200; i++) { // Reduced count for testing
                csv.write(String.format("%d,%d,%s,%d\n",
                        i + 1,
                        faker.number().numberBetween(0, 1000),
                        isoFormat.format(faker.date().past(7, TimeUnit.DAYS)),
                        faker.number().numberBetween(1, 1000)
                ));
            }
        }
    }

    private static void generatePublicHealthData() throws IOException {
        try (FileWriter csv = new FileWriter("public_health.csv")) {
            csv.write("zip_code,month_year,flu_cases\n");
            for (int i = 0; i < 50; i++) { // Reduced count for testing
                csv.write(String.format("%s,%s,%d\n",
                        faker.address().zipCode(),
                        new SimpleDateFormat("MM/yyyy").format(faker.date().past(365, TimeUnit.DAYS)),
                        faker.number().numberBetween(10, 5000)
                ));
            }
        }
    }
}