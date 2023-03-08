package com.softserve.edu.hw10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonService newJsonService = new JsonService();
        try {
            List<String> json = newJsonService.getJson("[STM] [2023-01-01 00:00:00,135]  INFORMATION {com.JsonParser} -  My Body: { \"amountTxn\": { \"paymentAmt\": { \"amtReserved\": null, \"totalAmtCharged\": null, \"chargingData\": { \"Segment\": 10, \"categoryCode\": \"MyApp\" }, \"totalAmountRefunded\": null, \"chargingInformation\": { \"amount\": 9999, \"description\": [\"Test (test)\"] } }, \"userId\": \"tel:+2313215\", \"txnStatus\": \"Charged\", \"origCode\": null, \"seq\": null } } TOKEN ID: 351351 {com.JsonParser}");
            System.out.println(json);
            json = newJsonService.getJson("[AWT] [2022-02-02 22:22:22,135]  {com.edu.hw10} -  My Body: { \"amountTxn\": { \"paymentAmt\": { \"amtReserved\": null, \"totalAmtCharged\": null, \"chargingData\": { \"LineOfBusiness\": 55, \"category\": \"Application\" }, \"totalAmountRefunded\": null, \"chargingInformation\": { \"counter\": 0099, \"definition\": [\"Start (start)\"] } }, \"userId\": \"tel:+2313215\", \"txnStatus\": \"Charged\", \"origCode\": null, \"seq\": null } } TOKEN ID: 351351 {com.edu.hw10}");
            System.out.println(json);
            json = newJsonService.getJson("com.JsonParser My Body: paymentAmt : amtReserved, totalAmtCharged : null, chargingData: Segment: 10, categoryCode: MyApp, totalAmountRefunded: null, chargingInformation: amount: 9999, description: JsonParser");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

