package com.subnexa.dollarbdconverter

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.subnexa.dollarbdconverter.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rateInput.setText("130")
        binding.amountInput.setText("1")
        calculate()

        binding.calculateButton.setOnClickListener { calculate() }
        binding.copyButton.setOnClickListener {
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            clipboard.setPrimaryClip(ClipData.newPlainText("BDT Result", binding.resultText.text))
            Toast.makeText(this, "Result copied", Toast.LENGTH_SHORT).show()
        }
    }

    private fun calculate() {
        val rate = binding.rateInput.text?.toString()?.toDoubleOrNull()
        val amount = binding.amountInput.text?.toString()?.toDoubleOrNull()

        if (rate == null || amount == null || rate < 0 || amount < 0) {
            binding.resultText.text = "৳0.00"
            return
        }

        binding.resultText.text = String.format(Locale.US, "৳%,.2f", rate * amount)
    }
}
