package com.hlomu.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hlomu.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener {
            val VA = binding.vaEditText.text.toString().toDoubleOrNull() ?: 0.0
            val VB = binding.vbEditText.text.toString().toDoubleOrNull() ?: 0.0
            val VC = binding.vcEditText.text.toString().toDoubleOrNull() ?: 0.0

            val VSUM = VA + VB + VC
            val VAVG = VSUM / 3
            val VAMG = VA - VAVG
            val VBMG = VB - VAVG
            val VCMG = VC - VAVG

            val ImbVA = (Math.abs(VAMG) / VAVG) * 100
            val ImbVB = (Math.abs(VBMG) / VAVG) * 100
            val ImbVC = (Math.abs(VCMG) / VAVG) * 100

            binding.resultTextView.text = """
                VAVG = ( $VA + $VB + $VC ) ÷ 3
                           = ( $VSUM ) ÷ 3 = $VAVG
                ImbVA = [ ABS( $VA - $VAVG ) ÷ $VAVG ]
                            = [ ABS( $VAMG ) ÷ $VAVG ] = $ImbVA
                ImbVB = [ ABS( $VB - $VAVG ) ÷ $VAVG ]
                            = [ ABS( $VBMG ) ÷ $VAVG ] = $ImbVB
                ImbVC = [ ABS( $VC - $VAVG ) ÷ $VAVG ]
                            = [ ABS( $VCMG ) ÷ $VAVG ] = $ImbVC
            """.trimIndent()
        }
    }
}}