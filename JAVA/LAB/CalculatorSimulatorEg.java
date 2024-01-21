class CountryNotValidException extends Exception {
    CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        double taxAmount;

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulatorEg {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        // Test Case 1
        try {
            taxCalculator.calculateTax("Ron", false, 34000);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        // Test Case 2
        try {
            double taxAmount = taxCalculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test Case 3
        try {
            double taxAmount = taxCalculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test Case 4
        try {
            taxCalculator.calculateTax(null, true, 30000);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
}
