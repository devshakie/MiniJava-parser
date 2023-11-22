package com.example.myapplicationassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnMilk;
    private Button btnSugar;
    private Button btnFlour;
    private Button btnBread;
    private TextView milkPriceTextView;
    private TextView milkVatTextView;
    private TextView milkActualPriceTextView;
    private TextView sugarPriceTextView;
    private TextView sugarVatTextView;
    private TextView sugarActualPriceTextView;
    private TextView flourPriceTextView;
    private TextView flourVatTextView;
    private TextView flourActualPriceTextView;
    private TextView breadPriceTextView;
    private TextView breadVatTextView;
    private TextView breadActualPriceTextView;
    private TextView grandTotalTextView;
    private TextView discountTextView;
    private TextView netPayTextView;


    private double milkPrice = 2000.0; // Initial price of milk
    private double sugarPrice = 1500.0; // Initial price of
    private double flourPrice = 2500.0; // Initial price of flour
    private double breadPrice = 3500.0; // Initial price of bread
    private double grandTotal = 0.0; //Initial grand-total

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMilk = findViewById(R.id.btnMilk);
        btnSugar = findViewById(R.id.btnSugar);
        btnFlour = findViewById(R.id.btnFlour);
        btnBread = findViewById(R.id.btnBread);
        milkPriceTextView = findViewById(R.id.priceMilk);
        milkVatTextView = findViewById(R.id.vatMilk);
        milkActualPriceTextView = findViewById(R.id.actualPriceMilk);
        sugarPriceTextView = findViewById(R.id.priceSugar);
        sugarVatTextView = findViewById(R.id.vatSugar);
        sugarActualPriceTextView = findViewById(R.id.actualPriceSugar);
        flourPriceTextView = findViewById(R.id.priceFlour);
        flourVatTextView = findViewById(R.id.vatFlour);
        flourActualPriceTextView = findViewById(R.id.actualPriceFlour);
        breadPriceTextView = findViewById(R.id.priceBread);
        breadVatTextView = findViewById(R.id.vatBread);
        breadActualPriceTextView = findViewById(R.id.actualPriceBread);
        grandTotalTextView = findViewById(R.id.grandTotal);
        discountTextView = findViewById(R.id.discount);
        netPayTextView = findViewById(R.id.netPay);




        btnMilk.setOnClickListener(new View.OnClickListener() {
            int clickCount = 0; // Keep track of button clicks

            @Override
            public void onClick(View v) {
                if (clickCount < 4) {
                    clickCount++;

                    // Calculate the prices
                    double price = milkPrice * clickCount;
                    double vatPrice = price * 0.16;
                    double actualPrice = price * 0.84;

                    // Update the TextViews with the calculated values
                    milkPriceTextView.setText("Price: " + price);
                    milkVatTextView.setText("VAT 16%: " + vatPrice);
                    milkActualPriceTextView.setText("Actual Price: " + actualPrice);

                    grandTotal += actualPrice;
                    grandTotalTextView.setText("Grand Total: " + grandTotal);
                    calculateDiscount();
                    calculateNetPay();

                }
            }
        });

        btnSugar.setOnClickListener(new View.OnClickListener() {
            int clickCount = 0; // Keep track of button clicks

            @Override
            public void onClick(View v) {
                if (clickCount < 4) {
                    clickCount++;

                    // Calculate the prices for Sugar
                    double price = sugarPrice * clickCount;
                    double vatPrice = price * 0.16;
                    double actualPrice = price * 0.84;

                    // Update the TextViews with the calculated values for Sugar
                    sugarPriceTextView.setText("Price: " + price);
                    sugarVatTextView.setText("VAT 16%: " + vatPrice);
                    sugarActualPriceTextView.setText("Actual Price: " + actualPrice);

                    grandTotal += actualPrice;
                    grandTotalTextView.setText("Grand Total: " + grandTotal);
                    calculateDiscount();
                    calculateNetPay();
                }
            }
        });

        btnFlour.setOnClickListener(new View.OnClickListener() {
            int clickCount = 0; // Keep track of button clicks

            @Override
            public void onClick(View v) {
                if (clickCount < 4) {
                    clickCount++;

                    // Calculate the prices
                    double price = flourPrice * clickCount;
                    double vatPrice = price * 0.16;
                    double actualPrice = price * 0.84;

                    // Update the TextViews with the calculated values
                    flourPriceTextView.setText("Price: " + price);
                    flourVatTextView.setText("VAT 16%: " + vatPrice);
                    flourActualPriceTextView.setText("Actual Price: " + actualPrice);

                    grandTotal += actualPrice;
                    grandTotalTextView.setText("Grand Total: " + grandTotal);
                    calculateDiscount();
                    calculateNetPay();
                }
            }
        });

        btnBread.setOnClickListener(new View.OnClickListener() {
            int clickCount = 0; // Keep track of button clicks

            @Override
            public void onClick(View v) {
                if (clickCount < 4) {
                    clickCount++;

                    // Calculate the prices
                    double price = breadPrice * clickCount;
                    double vatPrice = price * 0.16;
                    double actualPrice = price * 0.84;

                    // Update the TextViews with the calculated values
                    breadPriceTextView.setText("Price: " + price);
                    breadVatTextView.setText("VAT 16%: " + vatPrice);
                    breadActualPriceTextView.setText("Actual Price: " + actualPrice);

                    grandTotal += actualPrice;
                    grandTotalTextView.setText("Grand Total: " + grandTotal);
                    calculateDiscount();
                    calculateNetPay();
                }
            }
        });

    }



    // Calculate the discount
    private void calculateDiscount() {
        if (grandTotal > 10000) {
            double discount = grandTotal * 0.15;
            discountTextView.setText("Discount 15%: " + discount);
        } else {
            discountTextView.setText(""); // Clear the discount if not eligible
            showNoDiscountToast(); // Show a toast message if no discount was awarded
        }
    }

    // Show a toast message for no discount
    private void showNoDiscountToast() {
        Toast.makeText(this, "No discount awarded", Toast.LENGTH_SHORT).show();
    }

    // Calculate the net pay
    private void calculateNetPay() {
        if (grandTotal > 10000) {
            double netPay = grandTotal * 0.85;
            netPayTextView.setText("Net Pay: " + netPay);
        } else {
            netPayTextView.setText(""); // Clear the net pay if not eligible
        }
    }



}

